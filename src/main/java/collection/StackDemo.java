package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素，存取元素必须遵循先进后出的原则，
 * 使用栈通常来完成"后退"这样的功能
 *
 * 双端队列接口提供了栈方法:因此我们可以使用双端队列完成栈操作
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println(stack);

        String str = stack.pop();
        System.out.println(str);

        for (String s:stack){
            System.out.println(s);
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}
