package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Hollow
 * @create 2020/12/28 0028 10:33
 * 使用文件输入流读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        //将fos.txt文件中所有数据读取出来
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] data = new byte[1000];
        int len = fis.read(data);
        /*
            String提供的重载构造器
            String(byte[] data,int offset,int len,String csn)
            将给定的字节数组从下标offset处开始的连续len个字节按照给定的字符集转换为字符串
         */
        String str = new String(data,"UTF-8");
        System.out.println(str);
        System.out.println(str.length());
        fis.close();
    }
}
