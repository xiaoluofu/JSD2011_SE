package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Hollow
 * @create 2020/12/24 0024 15:23
 * java.ioRandomAccessFile
 * RAF是专门设计用来读写文件数据的API，其基于指针对文件进行随机读写
 */
public class RAFDemo1 {
    public static void main(String[] args) throws IOException {
        /*
            RandomAccessFile有两种构造器
            RandomAccessFile(File file,String mode)
            RandomAccessFile(String path,String mode)
            第一个参数作为操作的文件(File对象或直接给路径均可)
            第二个参数为对文件的操作模式：
            r:只读模式，仅对文件进行读操作
            rw:读写模式，对文件数据又能读又能写

         */
        RandomAccessFile raf =
                new RandomAccessFile("./raf.dat","rw");
        /*
             void write(int d)
             向文件中写入一个字节，写入的是指定的int值所对应的2进制的"底八位";
         */
        raf.write(1);
        raf.write(2);
        raf.write(128);
        raf.close();
    }
}
