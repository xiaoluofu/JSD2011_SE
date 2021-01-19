package test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("yjs.jpg");
        FileOutputStream fos = new FileOutputStream("yjs_cp.jpg",true);
        int len;
        byte[] data =new byte[1024*10];
        while ((len = fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        System.out.println("复制完毕");
        fis.close();
        fos.close();

    }
}
