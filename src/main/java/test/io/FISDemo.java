package test.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        byte[] data = new byte[1024];
        int len = fis.read(data);

        String str = new String(data,"UTF-8");
        System.out.println(str);
        System.out.println(len);
        fis.close();
    }
}
