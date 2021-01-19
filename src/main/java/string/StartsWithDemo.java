package string;

/**
 * @author Hollow
 * @create 2020/12/22 0022 16:58
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否是以给定的内容开始或者结束的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        boolean start = str.startsWith("www.");
        System.out.println(start);
        boolean end = str.endsWith(".com");
        System.out.println(end);
    }
}
