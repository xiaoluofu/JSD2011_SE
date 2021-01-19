package io;

import java.io.*;

/**
 * @author Hollow
 * @create 2020/12/29 0029 10:40
 * 使用流链接创建PrintWriter
 */
public class PWDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("pw2.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println("所以你好");
        pw.println("再见");
        System.out.println("写出完毕");
        pw.close();

    }
}
