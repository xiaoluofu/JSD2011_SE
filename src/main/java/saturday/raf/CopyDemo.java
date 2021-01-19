package saturday.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * @author Hollow
 * @create 2020/12/26 0026 14:09
 * 文件的复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("yjs.jpg","r");
        RandomAccessFile desc = new RandomAccessFile("yjs_cp.jpg","rw");
        int d;
        while ((d=src.read())!=-1){
            desc.write(d);
        }
        System.out.println("复制完毕");
        src.close();
        desc.close();
    }
}
