package socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Hollow
 * @create 2020/12/30 0030 19:49
 */
public class Server {
    private ServerSocket serverSocket;

    public Server(){
        try {
            System.out.println("正在启动服务器");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务器启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start(){


        try {
            System.out.println("等待客户端链接");
            Socket socket = serverSocket.accept();
            System.out.println("客户端链接成功");

            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);

            while (true){
                String line = br.readLine();
                if ("exit".equals(line)){
                    System.out.println("客户端关闭了");
                    break;
                }
                System.out.println("客户端说："+line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

}
