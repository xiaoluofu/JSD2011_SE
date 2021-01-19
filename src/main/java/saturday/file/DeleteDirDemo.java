package saturday.file;

import java.io.File;

/**
 * @author Hollow
 * @create 2020/12/26 0026 9:54
 * 文件夹的删除，当我们使用delete()操作时
 * 必须保证当前目录下内容为空
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir = new File("a/b");
        if (dir.exists()){
            System.out.println("文件夹已删除");
            dir.delete();
        }else{
            System.out.println("文件夹不存在");
        }
    }
}
