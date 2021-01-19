package stringtest;

public class MatcherDemo {
    public static void main(String[] args) {
        String s = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        String a = "1824929673@qq.com";
        String b = "asdf_@163.com";
        String c = "dadfa@tedu.com.cn";
        System.out.println(a.matches(s)+" "+b.matches(s)+" "+c.matches(s));
    }
}
