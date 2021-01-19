package io;

import java.io.*;
import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/29 0029 11:18
 * 程序启动后要求用户输入文件名，然后对文件进行写操作
 * 当用户单独输入exit时 程序退出
 *
 * 要求：自行组建流链接
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scn = new Scanner(System.in);
        System.out.println("请输入你想要进行操作的文件名");
        String input = scn.nextLine();
        FileOutputStream fos = new FileOutputStream(input+".txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        /*
            在流链接中创建PrintWriter时，如果第一个参数指定要链接的流后，可以再传入一个boolean值参数
            如果这个值为true，则打开了PrintWriter的自动行刷新功能
            即：每当我们调用println方法后就会自动flush
            注意：调用print方法后并不会flush
         */
        PrintWriter pw = new PrintWriter(bw,true);
        System.out.println("请输入你想要记录的话，回车换行，如果想退出，请输入exit");
        while (true){
            String input2 = scn.nextLine();
            if ("exit".equals(input2)){
                System.out.println("关闭了");
                break;
            }
            pw.println(input2);
        }
        pw.close();

    }
}
