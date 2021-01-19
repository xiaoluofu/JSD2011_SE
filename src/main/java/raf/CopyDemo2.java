package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Hollow
 * @create 2020/12/25 0025 9:13
 * 通过提高每次读写的数据量，减少实际读写的次数可以提高读写效率
 *
 * 单字节读写是随机读写形式。
 * 一组字节的读写是块儿读写形式。
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src =
                new RandomAccessFile("./yjs.jpg","r");
        RandomAccessFile desc =
                new RandomAccessFile("./yjs_cp.jpg","rw");
        /*
            int read(byte[] data)
            一次性从文件中读取给定的字节数组总长度的字节量并存入到该
            数组中，返回值为实际读取到的字节量

            void write(byte[] data)
            一次性将给定的字节数组总的所有字节写入到文件中

            void write(byte[] data,int offset,int len)
            一次性将给定字节数组中从下标offset处开始的连续len个字节写入文件
         */
        int len;
        byte[] data = new byte[1024*10];
        while ((len = src.read(data))!=-1){
            desc.write(data,0,len);
        }
        src.close();
        desc.close();
    }
}
