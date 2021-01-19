package collection;

import java.util.*;

/**
 * 集合的排序
 * 集合的工具类：java.util.Collections提供了一个静态方法sort
 * 可以对List集合进行自然排序(从小到大)
 */
public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random ran = new Random();
        for (int i =0;i<10;i++){
            list.add(ran.nextInt(100));
        }
        System.out.println(list);

//        Collections.sort(list);
        Collections.sort(list, (o1,o2)-> o2-o1);

        System.out.println(list);
    }
}
