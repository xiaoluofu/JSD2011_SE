package saturday.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Hollow
 * @create 2020/12/26 0026 14:14
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("yjs.jpg","r");
        RandomAccessFile desc = new RandomAccessFile("yjs_cp.jpg","rw");
        int len;
        byte[] data = new byte[1024*10];
        while((len = src.read(data))!=-1){
            desc.write(data,0,len);
        }
        System.out.println("复制完毕");
        src.close();
        desc.close();

    }
}
