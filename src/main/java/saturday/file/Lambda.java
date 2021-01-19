package saturday.file;

import java.io.File;

/**
 * @author Hollow
 * @create 2020/12/26 0026 11:00
 */
public class Lambda {
    public static void main(String[] args) {
        File dir = new File("./");
        if (dir.isDirectory()){
            File[] subs = dir.listFiles((file)->file.getName().endsWith(".txt"));
            for (int i =0;i<subs.length;i++) {
                System.out.println(subs[i].getName());
            }
        }
    }
}
