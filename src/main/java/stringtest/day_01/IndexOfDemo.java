package stringtest.day_01;

import com.sun.xml.internal.txw2.output.IndentingXMLFilter;

/**
 * @author Hollow
 * @create 2020/12/22 0022 19:13
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String index = "abdid12d3";
        int num = index.indexOf("a");
        System.out.println(num);
        int num2 = index.indexOf("9");
        System.out.println(num2);
        int num3 = index.indexOf("d",3);
        System.out.println(num3);
        int num4 = index.lastIndexOf("d");
        System.out.println(num4);
    }
}
