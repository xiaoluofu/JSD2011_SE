package test.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
        String str = "让我再看你一边，从南到北";

        byte[] data = str.getBytes("UTF-8");

        raf.write(data);
        System.out.println("写出完毕");

    }
}
