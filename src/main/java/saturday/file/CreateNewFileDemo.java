package saturday.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Hollow
 * @create 2020/12/26 0026 9:51
 * 文件的创建
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file =new File("./test.txt");
        if (file.exists()){
            System.out.println("文件已存在");
        }else{
            file.createNewFile();
            System.out.println("文件已创建");
        }
    }
}
