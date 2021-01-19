package test.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("yjs.jpg","r");
        RandomAccessFile desc = new RandomAccessFile("yjs_cp.jpg","rw");

        int len;
        byte[] data = new byte[1024 * 10];
        while ((len = src.read(data))!=-1){
            desc.write(data,0,len);
        }
        src.close();
        desc.close();
    }
}
