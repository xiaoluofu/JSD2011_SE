package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue队列
 * Queue接口继承自Collection,所以队列也是一种集合
 * 队列可以保存一组元素，但是取元素必须遵循先进先出原则
 * 常见的实现类:java.util.LinkedList
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);

        /*
            出队操作，获取并删除队列中的队首元素
         */
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);

        /*
            引用队首元素，获取后该元素不会从队列中删除
         */
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        /*
            使用迭代器遍历队列，元素不会从队列中被删除
         */
        //队列的遍历
        for (String s : queue){
            System.out.println(s);
        }
        System.out.println(queue);

        //用poll方法遍历队列
        while ((str = queue.poll())!=null){
            System.out.println(str);
        }
        System.out.println(queue);
    }
}
