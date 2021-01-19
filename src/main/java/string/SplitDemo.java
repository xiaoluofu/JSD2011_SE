package string;

import java.util.Arrays;

/**
 * @author Hollow
 * @create 2020/12/23 0023 14:05
 * String 支持正则表达式的方法之二
 * String[] split(String regex)
 * 将当前字符串满足正则表达式的部分进行拆分，将拆分后的每部分以数组形式返回
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "qwer123ww222.er..re....";
        String[] arr = str.split("[0-9]+");
        System.out.println(Arrays.toString(arr));//[qwer, ww, .er..re....]
        String[] arr2 = str.split("[a-z]+");//[, 123, 222., .., ....]
        System.out.println(Arrays.toString(arr2));
        /*
            若果连续出现可拆分项，则中间会拆分出一个空字符串，如果字符串就在开始就是可拆分项，则首先会拆分出一个空字符串
            注意，若果在字符串末尾连续匹配到可拆分项，所有拆分出的字符串都会被忽略。
         */
        String[] arr3 = str.split("\\.");
        System.out.println(Arrays.toString(arr3));//[qwer123ww222, er, , re]

    }
}
