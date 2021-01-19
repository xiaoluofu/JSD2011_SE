package saturday.raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/26 0026 14:32
 * 完成简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对该文件进行写操作。
 * 之后用户在控制台输入的每一行内容都要写入到文件中。
 * 当用户单独输入"exit"时程序退出
 *
 * 注:写入文件中的数据不需要考虑换行问题
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您想要创建的文件名");
        String inputname = scan.nextLine();
        File file = new File("./"+inputname+".txt");

        if (file.exists()){
            System.out.println("您所输入的文件已存在，将在现有的文件进行修改");
        }else{
            file.createNewFile();
            System.out.println("文件已创建成功，请输入你想要的输入的话");
        }
        RandomAccessFile raf = new RandomAccessFile(inputname+".txt","rw");

        while (true){
            String text = scan.nextLine();
            if ("exit".equals(text)){
                break;
            }
            byte[] data = text.getBytes(StandardCharsets.UTF_8);
            raf.write(data);
            System.out.println("输入成功，想要退出请输入exit");
        }
        raf.close();
        System.out.println("谢谢使用，古德拜");

    }
}
