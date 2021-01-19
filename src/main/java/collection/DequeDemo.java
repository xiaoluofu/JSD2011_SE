package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列：java.util.Deque接口
 * Deque继承自Queue，双端队列是队列两断都可以做出入队操作的队列
 * 实现类：java.util.LinkedList
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        System.out.println(deque);
        //从队首方向入队
        deque.offerFirst("zero");
        System.out.println(deque);
        //从队尾方向入队(与offer一致)
        deque.offerLast("four");
        System.out.println(deque);

        //从队首方向出队，与poll()一致
        deque.pollFirst();
        System.out.println(deque);
        //从队尾方向出队
        deque.pollLast();
        System.out.println(deque);
    }
}
