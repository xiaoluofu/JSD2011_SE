package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Hollow
 * @create 2020/12/25 0025 11:51
 * 从文件中读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("d.txt","r");
        byte[] data = new byte[(int)raf.length()];
        raf.read(data);
        String str = new String(data,"UTF-8");
        System.out.println(str);
        raf.close();
    }
}
