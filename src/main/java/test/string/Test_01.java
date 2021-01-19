package test.string;

import java.util.Scanner;

/**
 * 正则表达式练习:
 * 1:编写匹配数字的正则表达式,数字至少一位以上.
 *
 * 2:匹配字符串,要求输入3-15位,内容只能是数字,字母下,划线
 *
 *
 * 完成下面编程题:
 * 程序启动后,要求用户输入用户名,用户名出现内容要求上述正则表达式2的要求.不匹配则直接
 * 提示用户名有误.
 * 如果无误,则要求用户继续输入年龄,规则为上述正则表达式1的要求,不匹配则提示年龄有误
 * 以上两个输入获取是都要求以字符串形式接受(Scanner的nextLine方法获取)
 *
 * 最后验证年龄在1-100岁之间(包含1和100)
 * 提示:这里可以不用正则表达式验证范围,是否转换为数字判定更方便?
 * @author Xiloer
 *
 */
public class Test_01 {
    public static void main(String[] args) {
        String name = "[a-zA-Z0-9_]{3,15}";
        String age = "[0-9]{1,}";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名，要求输入3-15位,内容只能是数字,字母下,划线");
        while (true){
            String inputname = sc.nextLine();
            if (inputname.matches(name)){
                System.out.println("用户名输入成功");
                break;
            }
            System.out.println("用户名输入失败，请重新输入");
        }
        System.out.println("请输入年龄，需要在1-100之间");
        while (true){
            String inputage = sc.nextLine();
            if (inputage.matches(age)){
                int i = Integer.parseInt(inputage);
                if (i>0 && i<100){
                    System.out.println("年龄输入成功");
                    break;
                }
                System.out.println("年龄不合法");
            }
        }
    }
}
