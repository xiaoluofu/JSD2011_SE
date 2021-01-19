package socket2;

import javafx.scene.web.WebHistory;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/30 0030 19:49
 */
public class Client {
    private Socket socket;
    public Client(){

        System.out.println("正在链接服务器");
        try {
            socket = new Socket("172.96.42.22",8088);
            System.out.println("服务器连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);

            System.out.println("请发送你想要说的话,如果想退出请输入“exit”");
            while(true){
                String line = scanner.nextLine();
                pw.println(line);
                if ("exit".equals(line)){
                    System.out.println("输入结束");
                    break;
                }
            }
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
