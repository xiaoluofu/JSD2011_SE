package test.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");

        for (int i = 0;i < raf.length()/100;i++){
            byte[] bytes = new byte[32];
            raf.read(bytes);
            String username = new String(bytes,"UTF-8");

            raf.read(bytes);
            String password = new String(bytes,"UTF-8");

            raf.read(bytes);
            String nikename = new String(bytes,"UTF-8");

            int age = raf.readInt();
            System.out.println(raf.getFilePointer());
            System.out.println(username+","+password+","+nikename+","+age);
        }
        raf.close();
    }
}
