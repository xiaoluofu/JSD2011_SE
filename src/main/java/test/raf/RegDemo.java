package test.raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/25 0025 15:28
 * 完成用户注册功能
 * 程序启动后，要求用户输入：用户名，密码，昵称，年龄
 * 然后将该用户信息写入文件user.dat中
 *
 * 设计：
 * 每条记录占用100字节，其中用户名，密码，昵称各32字节。年龄是int固定占4字节
 * 字符串故意留白可以方便后期的修改，而且可以让长度固定，统一，便于读取
 */
public class RegDemo {
    public String inputMatch(){
        Scanner scan = new Scanner(System.in);
        String match = "[a-zA-Z0-9_]+";
        while (true) {
            String input = scan.nextLine();
            if (match.equals(input)){
                System.out.println("注册成功");
                return input;

            }
            System.out.println("输入格式错误，请重新输入");
        }
    }


    public static void main(String[] args) throws IOException {
        File file = new File("user.dat");
        if (!file.exists()){
            file.createNewFile();
        }

        RegDemo reg = new RegDemo();
        System.out.println("请输入用户名");
        String username = reg.inputMatch();

        System.out.println("请输入密码");
        String password = reg.inputMatch();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入昵称");
        String nikename = scanner.nextLine();

        System.out.println("请输入年龄");
        int age = scanner.nextInt();

        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        raf.seek(raf.length());

        byte[] bytes = username.getBytes(StandardCharsets.UTF_8);
        bytes = Arrays.copyOf(bytes,32);
        raf.write(bytes);

        bytes = password.getBytes(StandardCharsets.UTF_8);
        bytes = Arrays.copyOf(bytes,32);
        raf.write(bytes);

        bytes = nikename.getBytes(StandardCharsets.UTF_8);
        bytes = Arrays.copyOf(bytes,32);
        raf.write(bytes);

        raf.writeInt(age);
        System.out.println("end");
        raf.close();

    }
}
