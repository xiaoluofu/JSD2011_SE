package string;

/**
 * @author Hollow
 * @create 2020/12/22 0022 17:18
 * String 提供了一组重载的静态方法valueOf
 * 作用是将其他类型转换为字符串
 */
public class ValueOfDemo {
    public static void main(String[] args) {

        int a = 123;
        double d = 123.123;

        String s1 = String.valueOf(a);
        System.out.println(s1);//123
        String s2 = String.valueOf(d);
        System.out.println(s2);//123.123
    }
}
