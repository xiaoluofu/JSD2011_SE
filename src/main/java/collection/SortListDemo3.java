package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 当元素已经实现了Comparable接口，但是该比较规则不满足我们排序需求时
 * 也可以用重载的sort方法排序
 *
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("tom");
//        list.add("jerry");
//        list.add("mike");
//        list.add("Rose");
//        list.add("Jack");
//        list.add("jackson");
//        list.add("bill");
//        list.add("ada");
//        System.out.println(list);

        list.add("苍老师");
        list.add("峰哥");
        list.add("我带你们打");
        list.add("fgnb");

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
        Collections.sort(list, (o1,o2)-> o1.length()-o2.length());
        System.out.println(list);


    }
}
