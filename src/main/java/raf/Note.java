package raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
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
        System.out.println("请输入你想要创建的文件名");

        String input = scanner.nextLine();
        File file = new File("./" + input +".txt");
        if (file.exists()){
            System.out.println("文件名存在，将在该文件中进行输入");
        }else{
            file.createNewFile();
            System.out.println("文件创建成功，请输入你想要输入的内容");
        }
        RandomAccessFile src = new RandomAccessFile(input + ".txt", "rw");
        while (true) {
            String input2 = scanner.nextLine();
            if ("exit".equals(input2)) { //把自变量放外面，避免空指针异常
                break;
            }
            byte[] data = input2.getBytes("UTF-8");
            src.write(data);
            System.out.println("输入成功,如果你想要退出请输入exit");
        }
        System.out.println("已退出");
        src.close();
    }
}
