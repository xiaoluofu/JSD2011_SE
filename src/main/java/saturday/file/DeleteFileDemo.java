package saturday.file;

import java.io.File;

/**
 * @author Hollow
 * @create 2020/12/26 0026 9:54
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()){
            System.out.println("文件已删除");
            file.delete();
        }else{
            System.out.println("文件不存在");
        }
    }
}
