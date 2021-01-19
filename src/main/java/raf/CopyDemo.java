package raf;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Hollow
 * @create 2020/12/24 0024 16:53
 * 文件的复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("./yjs.jpg","r");
        RandomAccessFile desc = new RandomAccessFile("./yjs_cp.jpg","rw");

        int d;
        while ((d=src.read())!=-1){
            desc.write(d);
        }
        System.out.println("复制完毕");
        src.close();
        desc.close();
    }
}
