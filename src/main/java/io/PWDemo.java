package io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Hollow
 * @create 2020/12/29 0029 10:15
 * 缓冲字符流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲字符流内部有一个缓冲区，读写文本数据会被统一转换为块读写保证效率
 * 并且可以按行读写文本数据
 *
 * java,io.PrintWriter具有自动行刷新功能的缓冲字符流，内部总是链接
 * BufferedWriter作为缓冲功能。这个流更常用
 *
 */
public class PWDemo {
    public static void main(String[] args) throws IOException {
        /*
            PrintWriter提供了直接对文件进行操作的构造方法
            PrintWriter(String fileName)
            PrintWriter(File file)
            并且还可以在传入一个参数来指定字符集
            实际上以上构造器内部会自行完成流链。
         */

        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");

        pw.println("wdnmd");
        pw.println("芜湖起飞");
        System.out.println("写出完毕");
        pw.close();
    }
}
