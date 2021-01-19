package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List接口
 * List集合继承自Collection，是Collection下面最常用的一类集合
 * List的特点是可以放重复元素且有序，在List接口中定义了一组通过下标操作元素的方法
 *
 * 常用的实现类：
 * java.util.ArrayList:使用数组实现，查询性能更好
 * java.util.LinkedList:使用链表实现，增删性更好首位增删性能最佳
 * 在没有对性能有特别苛刻的要求下，通常使用ArrayList即可
 *
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        /*
            E get(int index)
            获取给定下标处对应的元素
         */
        //获取集合中第三个元素
        String str = list.get(3);
        System.out.println(str);//four

        //使用普通for循环遍历List集合
        for (int i =0;i<list.size();i++){
            str = list.get(i);
            System.out.println(str);
        }
        /*
            E set(int index,E e)
            将给定元素设置到指定位置，返回值为该位置原来的元素
            所以set是替换元素操作
         */
        String old = list.set(1, "2");
        System.out.println(list);//[one, 2, three, four, five]
        System.out.println(old);//two

        /*
            将集合元素反转
            要求：不能创建新集合
         */

        for (int i = 0;i < list.size()/2;i++){
            String str1 = list.get(i);
            list.set(i ,list.get(list.size()-1-i));
            list.set(list.size()-1-i ,str1);
        }
        System.out.println(list);



    }
}
