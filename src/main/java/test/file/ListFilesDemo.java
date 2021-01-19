package test.file;

import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File(".");

        if (dir.isDirectory()){
            File[] files = dir.listFiles();
            for(int i = 0;i < files.length;i++){
                System.out.println(files[i]);
            }
        }else{
            System.out.println("这不是个文件夹");
        }
    }
}
