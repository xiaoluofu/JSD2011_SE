package saturday.file;

import java.io.File;

/**
 * @author Hollow
 * @create 2020/12/26 0026 10:09
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File("./");
        //isDirectory()判断是否为文件夹
        //isFile()判断是否为文件
        if (dir.isDirectory()){
            File[] subs = dir.listFiles();
            for (int i = 0; i < subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}
