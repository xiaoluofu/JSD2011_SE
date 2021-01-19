package raf;


import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * @author Hollow
 * @create 2020/12/25 0025 10:13
 * 向文件中写入文本数据(字符串)
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("raf.txt","rw");
        String str = "让我再看你一遍，从南道北。";
        /*
            String提供了将当前字符串转换为一组字节的方法：
            byte[] getBytes(String csn)
            参数为指定的字符集的名字，常用的:UTF-8
            当字符集名字指定错误时，会抛出如下异常:不支持的字符集异常
            UnsupportedEncodingException:UTF-8

         */
        byte data[] = str.getBytes("UTF-8");
        raf.write(data);
        System.out.println("写出完毕！");
        raf.close();

    }
}
