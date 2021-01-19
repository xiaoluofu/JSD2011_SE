package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 *
 * 数组的工具类：java.util.Arrays提供了一个静态方法:asList
 * 可以将当前数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] arr = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(arr));
        //集合的泛型与数组的类型一致即可
        List<String> list = Arrays.asList(arr);
        System.out.println("List:"+list);
        /*
            注意！对集合的元素操作就是对原数组对应的操作！
         */
        list.set(1,"1");
        System.out.println("List:"+list);//List:[one, 1, three, four, five]
        System.out.println("array:"+ Arrays.toString(arr));
        //array:[one, 1, three, four, five]

        /*
            由于数组是定长的，因此会改变数组长度的操作都是不被允许的
            因此我们不能调用集合的如：add，remove这样的方法，否则会抛出异常
            java.lang.UnsupportedOperationException
         */
//        list.add("seven");//异常

//        List<String> list1 = new ArrayList<>();
//        list1.addAll(list);
        /*
            所有集合都支持一个参数为Collection的构造器，作用是在创建当前集合的同时
            包含给定集合中的所有元素，下面这个实例化过程等同上面两句的操作
         */
        List<String> list1 = new ArrayList<>(list);
        list1.add("seven");
        System.out.println(list1);//[one, 1, three, four, five, seven]

    }
}
