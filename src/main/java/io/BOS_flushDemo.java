package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author Hollow
 * @create 2020/12/28 0028 15:28
 * 缓冲输出流写出数据的缓冲区问题
 */
public class BOS_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("wdnmd".getBytes(StandardCharsets.UTF_8));
        /*
            void flush()
            flush方法可以强制将缓冲流中已经缓冲的数据一次性写出
            频繁调用该方法会降低写出数据的效率，但是可以达到写出数据的即时性。
         */
        bos.flush();
        System.out.println("写出完毕");
        bos.close();
    }
}
