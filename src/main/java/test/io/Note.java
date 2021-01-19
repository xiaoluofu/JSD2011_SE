package test.io;

import java.io.*;
import java.util.Scanner;

public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入逆向操作的文件");
        String name = scan.nextLine();
        FileOutputStream fos = new FileOutputStream(name+".txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        System.out.println("请输入你想记录的话，想退出的话输入exit");
        while (true) {
            String input = scan.nextLine();
            if ("exit".equals(input)) {
                System.out.println("已退出，古德拜");
                break;
            }
            pw.println(input);
        }
        pw.close();
    }
}
