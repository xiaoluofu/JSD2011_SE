package string;

/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串，两个参数分别为开始的下标和结束的下标位置
 * 注：在javaAPI中通常使用两个数字表示范围时都是“含头不含尾”的
 */
public class SubstringDemo {
    public static String getHostName(String address){
        int index1 = address.indexOf(".");
        int index2 = address.indexOf(".",index1+1);
        return address.substring(index1+1,index2);
    }
    public static void main(String[] args) {
        String host = "www.tedu.cn";
        //获取域名，
        String index = host.substring(4,8);
        System.out.println(index);
        //一个参数的重载方法则是从指定位置截取到字符串末尾
        index = host.substring(4);
        System.out.println(index);

        String name1 = getHostName("http://www.tedu.org");
        System.out.println(name1);
        String name2 = getHostName("doc.canglaoshi.org");
        System.out.println(name2);
        String name3 = getHostName("www.tts.com.cn");
        System.out.println(name3);
    }

}
