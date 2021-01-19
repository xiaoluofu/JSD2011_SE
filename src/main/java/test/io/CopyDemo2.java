package test.io;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("yjs.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("yjs_cp.jpg",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len;
        while ((len = bis.read())!=-1){
            bos.write(len);
        }
        System.out.println("复制完毕");
        bis.close();
        bos.close();
    }
}
