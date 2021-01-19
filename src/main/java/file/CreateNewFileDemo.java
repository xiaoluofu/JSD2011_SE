package file;

import java.io.File;
import java.io.IOException;

/**
 * @author Hollow
 * @create 2020/12/24 0024 10:45
 * 创建一个新文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        /*
            在当前目录下创建一个新建的而文件：test.txt
         */
//        File file = new File("./test.txt");
        //在相对路径中"./"可以忽略不写，默认就是在当前目录下
        File file = new File("text.txt");

        if (file.exists()){
            System.out.println("文件已存在");
        }else{
            file.createNewFile();
            System.out.println("该文件创建成功");
        }
    }

}
