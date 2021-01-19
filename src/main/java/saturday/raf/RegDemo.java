package saturday.raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/26 0026 14:48
 *  完成用户注册功能
 *  程序启动后，要求用户输入：用户名，密码，昵称，年龄
 *  然后将该用户信息写入文件user.dat中
 *
 *  设计：
 *  每条记录占用100字节，其中用户名，密码，昵称各32字节。年龄是int固定占4字节
 *  字符串故意留白可以方便后期的修改，而且可以让长度固定，统一，便于读取
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String match = "[0-9a-zA-Z_]{1,32}";
        System.out.println("请输入您的用户名，格式为：3-15位,内容只能是数字,字母，下划线");
        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        raf.seek(raf.length());
        while (true){
            String username = scan.nextLine();
            if (username.matches(match)){
                System.out.println("用户名注册成功，请输入你的密码，格式为：3-15位,内容只能是数字,字母下,划线");
                byte[]bytes = username.getBytes(StandardCharsets.UTF_8);
                bytes = Arrays.copyOf(bytes,32);
                raf.write(bytes);
                break;
            }
            System.out.println("用户名不符合规格，请重新输入");

        }
        while (true){
            String password = scan.nextLine();
            if (password.matches(match)){
                System.out.println("输入密码成功");
                byte[] bytes = password.getBytes(StandardCharsets.UTF_8);
                bytes = Arrays.copyOf(bytes,32);
                raf.write(bytes);
                break;
            }
            System.out.println("输入的密码格式错误，请重新输入");
        }

        System.out.println("请输入你的昵称");
//        while (true) {
//            String nikename = scan.nextLine();
//            byte[] bytes = new byte[32];
//            for (int i =0;i<raf.length()/100;i++){
//                raf.seek(i*100+64);
//
//                raf.read(bytes);
//                String nikename1 = new String(bytes,"UTF-8").trim();
//
//            }
//        }



        while (true){
            int age = scan.nextInt();
            if (age<=100){
                raf.writeInt(age);
                System.out.println("年龄输入成功");
                break;
            }
            System.out.println("输入的年龄不符合规格，请重新输入");
        }
        System.out.println("成功了");


    }
}
