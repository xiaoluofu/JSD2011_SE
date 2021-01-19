package test.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo1 {
    public static void main(String[] args) {

        try {
            RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
            raf.write(5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
