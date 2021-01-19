package saturday.integer;

import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/26 0026 11:14
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        char cmax = Character.MAX_VALUE;
        System.out.println((int)cmax);
        String a = "123";
        int i = Integer.parseInt(a);
        System.out.println(i);

        int dd = new Integer(123);
        Integer bb = Integer.valueOf(5);
//        Scanner sc = new Scanner(System.in);
//        String age = "[0-9]{1,3}";
//        String input = sc.nextLine();
//        if (input.matches(age)){
//            int b = Integer.parseInt(input);
//            if (b>100){
//                System.out.println("您输入的年龄不合法");
//            }else{
//                System.out.println("您输入的年龄是合法的");
//            }
//        }else{
//            System.out.println("请输入三位年龄");
//        }
    }
}
