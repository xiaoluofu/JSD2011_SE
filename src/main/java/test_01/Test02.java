package test_01;

import java.util.Scanner;

/**
 * 要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入你的用户名");
        Scanner scan = new Scanner(System.in);

        boolean b = true;
        while (b) {
            String input = scan.nextLine();
            if (input.length() == 0) {
                System.out.println("用户名不能为空，请重新输入");

            } else if (input.length() > 20) {
                System.out.println("用户名的长度要在20个字符以内");

            } else {
                System.out.println("恭喜你，用户名格式正确了");
                b = false;
            }
        }

    }

}
