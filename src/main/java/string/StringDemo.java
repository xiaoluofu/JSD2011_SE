package string;

/**
 * String常量池
 * 常量池时虚拟机在堆内存中开辟的一段空间，用来缓存所有使用字符串字面量形式创建的字符串对象
 * 当再次使用相同的字面量创建字符串时会重用对象减少内存开销
 *
 */

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123adf";
        String s2 = "123adf";
        System.out.println(s1==s2);

        s1 = s1 + "+";//修改内容会创建新的对象
        System.out.println(s1);
        System.out.println(s1 == s2);

        String s3 = new String("123adf");
        System.out.println(s2 == s3);//开辟了新内存，所以false
        //字符串比较内容都要使用equals方法，几乎用不到==
        System.out.println(s2.equals(s3));//equals 来比较内容是否一样

        /*
            这里出发了一个编译器的特性，编译器在编译期间如果能确定一个计算表达式的结果时，就会进行
            计算，并将结果编译到class文件中、
            下面代码会被编译期改为：
            String s5 = "123adf";
         */

        String s4 = "123" + "adf";
        System.out.println(s4 == s2);//true s4就相当于“123adf”
        String s = "123";
        String s5 = s + "adf";
        System.out.println(s5 == s2);//false
    }
}
