package string;

/**
 * @author Hollow
 * @create 2020/12/23 0023 14:31
 * String支持正则表达式的方法之三：
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 */
public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "abc123abc258abc123";
        String str1 = str.replaceAll("[a-z]+","123");
        String str2 = str.replaceAll("[0-9]+","WDNMD");
        System.out.println(str1);
        System.out.println(str2);
    }
}
