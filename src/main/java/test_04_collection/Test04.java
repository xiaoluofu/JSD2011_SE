package test_04_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合元素翻转:第一个在最后一个，最后一个在第一个。
 * 以此类推，并输出
 * 
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random ran = new Random();
        for (int i =0;i<10;i++){
            list.add(ran.nextInt(101));
        }
        System.out.println(list);

        Collections.reverse(list);
//        for (int i=0;i<list.size()/2;i++){
//            Integer i1 = list.set(i, list.get(list.size()-1-i));
//            list.set(list.size()-1-i,i1);
//        }
        System.out.println(list);
    }
}
