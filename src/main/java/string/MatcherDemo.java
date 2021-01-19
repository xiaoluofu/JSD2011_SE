package string;

import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/23 0023 11:52
 * String支持正则表达式的方法之一：
 * 使用给定的正则表达式验证当前字符串是否符合格式要求
 * 注意！给定的正则表达式就算不加边界匹配符也是做全匹配验证的
 */
public class MatcherDemo {
    public static void main(String[] args) {
        /*
                邮箱的正则表达式：
                [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
        String s = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.matches(s));

    }
}
