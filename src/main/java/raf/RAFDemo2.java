package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Hollow
 * @create 2020/12/24 0024 16:16
 * 从文件中读取数据
 */
public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("./raf.dat","r");
        /*
            int read()
            从文件中读取1个字节，并以int形式返回。如果返回的int值为-1则表示读取到了文件末尾
            EOF:end of file
            raf.dat文件内容:
            00000001 00000010 10000000
         */
        int d = raf.read();
        System.out.println(d);
        d = raf.read();
        System.out.println(d);
        d = raf.read();
        System.out.println(d);
    }
}
