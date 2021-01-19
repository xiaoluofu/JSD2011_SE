package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Hollow
 * @create 2020/12/28 0028 11:33
 * 使用文件流完成文件的复制操作
 * 创建一个文件输入流读取源文件
 * 创建一个文件输出流用于写复制的文件
 * 利用块读写的方法循环从原文件一次读取10l数据并写入到复制文件中
 * 复制完毕后关闭
 *
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("yjs.jpg");
        FileOutputStream fos = new FileOutputStream("yjs_cp1.jpg",true);
        byte[] data = new byte[1024*10];
        int len;
        while ((len = fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        System.out.println("复制完毕");
        fis.close();
        fos.close();


    }

}
