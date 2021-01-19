package test.file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) {
        File f =new File("abc.txt");
        if (f.exists()){
            System.out.println("文件已存在");
        }else{
            try {
                f.createNewFile();
                System.out.println("文件创建完毕");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
