package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了一对重载的add,remove方法
 *
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        /*
            void add(int index,E e)
            将给定元素插入到指定位置
         */
        list.add(2,"2.5");
        System.out.println(list);//[one, two, 2.5, three, four, five]

        /*
            E remove(int index)
            删除并返回指定位置对应的元素
         */
        String old = list.remove(2);
        System.out.println(list);//[one, two, three, four, five]
        System.out.println(old);//2.5

        //删除list中"four"元素
        for (int i =0;i<list.size();i++){
            if ("four".equals(list.get(i))){
                list.remove(i);
            }
        }
        System.out.println(list);


        //删除 list1集合中的100
        List<Integer> list1 = new ArrayList<>();
        list1.add(100);//自动装箱 new Integer
        list1.add(200);
        list1.add(300);
        boolean b = list1.remove(new Integer(100));
        System.out.println(b);

    }
}
