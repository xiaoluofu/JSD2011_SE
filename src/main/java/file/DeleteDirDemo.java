package file;

import java.io.File;

/**
 * @author Hollow
 * @create 2020/12/24 0024 11:33
 * 删除目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //删除demo目录
        File dir = new File("demo");
        if (dir.exists()){
            /*
                delete删除目录时有一个前提条件：目录必须时空的才可以删除！
             */
            dir.delete();
            System.out.println("目录以删除");
        }else {
            System.out.println("目录不存在");
        }
    }
}
