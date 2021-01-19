package test.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    /*
        java.net.Socket 套接字
        Socket封装了TCP协议的链接和通讯细节，使得我们可以很方便的与远端计算机建立链接
        并基于两个流的读写操作完成与远端计算机的数据交换，达到通讯的目的。
     */
    private Socket socket;

    /**
     *构造方法，用来初始化客户端
     */

    public Client(){
         /*
                实例化Socket时需要传入两个参数，分别是：
                host:指定服务端计算机的IP地址
                port:服务端应用程序在服务端计算机上申请的端口
                我们可以通过IP找到服务端计算机，通过端口找到运行在服务端计算机上的服务端应用程序，从而与之建立链接

                注:实例化Socket的过程就是链接的过程，如果指定的地址无法与服务器建立链接就会抛出异常
         */
        try {
            System.out.println("正在连接服务器");
            socket = new Socket("192.168.1.105",8088);
            System.out.println("服务器链接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *客户端开始工作的方法
     */
    public void start(){
        /*
                OutputStream getOutputStream()
                通过Socket的这个方法获取的字节输出流写出的字节会通过网络发送给远端计算机
        */
        try {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner scan = new Scanner(System.in);
            while (true){
                String input = scan.nextLine();
                if ("exit".equals(input)){
                    System.out.println("链接断开");
                    break;
                }
                pw.println(input);
            }
            pw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
