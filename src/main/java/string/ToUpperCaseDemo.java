package string;

import java.util.Random;

/**
 * @author Hollow
 * @create 2020/12/22 0022 17:08
 * String toLowerCase()
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全小写或全大写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java!!";
        String upper = str.toUpperCase();
        System.out.println(upper);
        String lower = str.toLowerCase();
        System.out.println(lower);

        Random ran = new Random();

        char arr[] = new char[5];
        for (int i = 0 ;i<arr.length;i++){
            int index = ran.nextInt(2);
        }



    }
}
