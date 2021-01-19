package saturday.file;

import java.io.File;

/**
 * @author Hollow
 * @create 2020/12/26 0026 9:57
 */
public class MkDirDemo {
    public static void main(String[] args) {
        File dir = new File("a/b/c");
        if (dir.exists()){
            System.out.println("文件目录已存在");
        }else{
            //dir.mkdir必须保证父目录存在，否则不会创建
            //dir，mkdirs会将所有不存在的父目录创建出来

            dir.mkdirs();
            System.out.println("文件目录已创建");
        }
    }
}
