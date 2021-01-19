package file;

import java.io.File;

/**
 * @author Hollow
 * @create 2020/12/24 0024 11:06
 * 创建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下创建一个新的目录：demo
        File dir = new File("demo");
        if (dir.exists()){
            System.out.println("该目录存在");
        }else {
            //mkdir要求创建的目录所在的目录必须存在
            //dir.mkdir();
            //mkdirs则会将不存在的父目录一同创建出来，使用更灵活
            dir.mkdir();
            System.out.println("该目录已创建");
        }

    }
}
