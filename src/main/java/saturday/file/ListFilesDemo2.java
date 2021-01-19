package saturday.file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Hollow
 * @create 2020/12/26 0026 10:14
 * 筛选一个文件夹中只含有某些特定字符的文件，并展示出来
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File("./");
        if (dir.isDirectory()){

            File[] subs = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.getName().endsWith(".txt");
                }
            });//使用了一个匿名内部类，并用一个数组直接去接收，匿名内部类用在类中只有一个方法的时候
            for (int i = 0; i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}
