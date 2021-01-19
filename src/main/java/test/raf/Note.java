package test.raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/25 0025 10:38
 * 完成简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对该文件进行写操作。
 * 之后用户在控制台输入的每一行内容都要写入到文件中。
 * 当用户单独输入"exit"时程序退出
 *
 * 注:写入文件中的数据不需要考虑换行问题
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想操作的文件名");
        String input = scanner.nextLine();

        File file = new File(input+".txt");
        if (file.exists()){
            System.out.println("文件已存在，将在该文件进行操作");
        }else{
            file.createNewFile();
            System.out.println("文件创建完毕");
        }
        System.out.println("请输入你想记录的话");
        RandomAccessFile raf = new RandomAccessFile(input+".txt","rw");
        while (true){
            String text = scanner.nextLine();
            if ("exit".equals(text)){
                System.out.println("程序退出，再见");
                break;
            }
            byte[] data = text.getBytes(StandardCharsets.UTF_8);
            raf.write(data);
            System.out.println("输入成功，如果想退出请输入exit");
        }
        raf.close();

    }
}
