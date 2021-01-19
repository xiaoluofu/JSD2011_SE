package object;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
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
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String inputname = sca.nextLine();
        boolean flag =true;
        byte[] data = new byte[32];
        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        for (int i = 0;i<raf.length()/100;i++){
            raf.read(data);
            String username = new String(data,"UTF-8").trim();
            if (username.equals(inputname)){
                raf.seek(i*100+64);
                System.out.println("请输入新昵称");
                String inputnikename = sca.nextLine();
                data = inputnikename.getBytes("UTF-8");
                data = Arrays.copyOf(data,32);
                raf.write(data);
                flag = false;
                System.out.println("新昵称改写成功");
                break;
            }
        }
        if (flag){
            System.out.println("查无此人");
        }
        raf.close();



    }
}
