package test.raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/25 0025 16:58
 * 修改昵称功能
 * 程序启动后，要求用户输入用户名和新昵称。然后将user.dat文件中该用户的昵称进行修改。
 * 如果输入的用户名不存在则输出"查无此人"
 *
 * 思路：
 * 首先循环读取user.dat文件中每个用户的用户名进行比对，如果找到该用户
 * 则将指针移动到该条记录的昵称位置，然后将新的昵称转换为字节数组后扩容到32字节并写入来覆盖原昵称信息。
 */
public class UpdateDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf= new RandomAccessFile("user.dat","rw");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scan.nextLine();
        System.out.println("请输入新昵称");
        String nikename = scan.nextLine();
        boolean b = true;

        for (int i = 0;i < raf.length()/100;i++){
            raf.seek(i*100);
            byte[] bytes = new byte[32];
            raf.read(bytes);
            String username1 = new String(bytes,"UTF-8").trim();
            if (username1.equals(username)){
                raf.seek(i*100+64);
                bytes = nikename.getBytes(StandardCharsets.UTF_8);
                bytes = Arrays.copyOf(bytes,32);
                raf.write(bytes);
                b = false;
                System.out.println("修改成功");
                break;
            }
        }
        if (b){
            System.out.println("查无此人");
        }
        raf.close();

    }
}
