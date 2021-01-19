package saturday.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * @author Hollow
 * @create 2020/12/26 0026 14:26
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("raf.txt","rw");
        String str = "wdnmd";

        byte[] data = str.getBytes(StandardCharsets.UTF_8);
        raf.write(data);
        raf.close();
        System.out.println("完毕");
    }
}
