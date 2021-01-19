package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 聊天室服务端
 */
public class Server {
    /*
        java.net.ServerSocket是运行在服务端的，如果我们把Socket
        比喻为"电话",那么ServerSocket则比喻为"总机"
        ServerSocket主要有两个工作:
        1:向服务端的操作系统申请服务端口，客户端就是通过这个端口与
          ServerSocket建立链接的
        2:监听服务端口，一旦一个客户端尝试建立链接，此时会立即创建一个
          Socket(相当于接电话)，然后通过这个Socket就可以与建立链接
          的客户端交互了。
     */
    private ServerSocket serverSocket;
    /*
        该数组用于保存所有ClientHandler对应的客户端的输出流
        便于他们之间互相广播消息使用
     */
//    private PrintWriter[] allOut = {};
    private Collection<PrintWriter> allOut = new ArrayList<>();

    public Server(){
        try {
            System.out.println("正在启动服务端...");
            /*
                创建ServerSocket时要指定服务端口，该端口不能与系统
                中其他程序的端口冲突，否则会抛出异常:
                java.net.BindException:address already in use
             */
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            /*
                ServerSocket提供的方法:
                Socket accept()
                该方法是一个阻塞方法，调用后程序"卡住"，直到一个客户端
                与服务端建立链接，此时accept方法会立即返回一个Socket
                通过这个Socket就可以和该客户端交互了。
                多次调用这个方法就可以与让多个客户端建立链接。
             */
            while(true) {
                System.out.println("等待客户端链接...");
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端链接了!");

                ClientHandler clientHandler = new ClientHandler(socket);
                Thread t = new Thread(clientHandler);
                t.start();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程任务是负责与指定的客户端进行交互
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//远端计算机地址信息(客户端)

        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取客户端的IP地址的字符串格式
            host = socket.getInetAddress().getHostAddress();
        }

        public void run(){
            PrintWriter pw = null;
            try{
                /*
                    InputStream getInputStream()
                    通过Socket的这个方法可以获取一个字节输入流，读取的就是
                    远端计算机发送过来的数据。
                 */
                InputStream in = socket.getInputStream();
                InputStreamReader isr
                        = new InputStreamReader(in, "UTF-8");
                BufferedReader br = new BufferedReader(isr);

                //通过socket获取输出流，用于给客户端发送消息
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw
                        = new OutputStreamWriter(out,"UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);
                /*
                    将对应当前客户端的输出流存入allOut,以便其他ClientHandler可以
                    将消息转发给当前客户端。
                 */
                /*
                    this不行，因为这里的this是ClientHandler实例
                    每个线程都有自己的ClientHandler，因此看到的不是
                    同一个对象
                 */
//                synchronized (this) {//不行
                /*
                    allOut数组不可以，是因为我们对数组扩容过，扩容会产生新对象
                    这样其他线程看到的allOut不一定是当前线程之前锁定的数组对象了，
                    很有可能看到的是扩容后的新数组对象(没有锁的)
                 */
//                synchronized (allOut) {//不行

                //外部类的ServerSocket属性值没有改变过，可以作为锁对象
//                synchronized (serverSocket) {//可以

                //或者直接用这些内部类所属的外部类Server的实例
                synchronized (Server.this) {//可以
                    //1先对allOut数组扩容
//                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
//                    //2将对应当前客户端的输出流存入该数组
//                    allOut[allOut.length - 1] = pw;
                    allOut.add(pw);

                }
                System.out.println(host+"上线了，当前在线人数:"+allOut.size());




                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(host + "说:" + line);
                    synchronized (Server.this) {
                        //遍历allOut，将消息回复给每一个客户端
//                        for (int i = 0; i < allOut.length; i++) {
//                            allOut[i].println(host + "说:" + line);
//                        }
                        for (PrintWriter printWriter:allOut){
                            printWriter.println(host + "说:" + line);
                        }
                    }
                }
            }catch(IOException e){
//                e.printStackTrace();
            }finally{
                //当客户端断开后要进行的相关处理
                synchronized (Server.this) {
                    //将当前客户段的输出流从allOut数组中删除
//                    for (int i = 0; i < allOut.length; i++) {
//                        if (allOut[i] == pw) {
//                            allOut[i] = allOut[allOut.length - 1];
//                            allOut = Arrays.copyOf(allOut, allOut.length - 1);
//                            break;
//                        }
//                    }
                allOut.remove(pw);
                }
                System.out.println(host+"下线了，当前在线人数:"+allOut.size());

                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}














