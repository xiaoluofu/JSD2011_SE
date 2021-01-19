package thread;

import java.util.Scanner;

/**
 * @author Hollow
 * @create 2020/12/31 0031 17:05
 * sleep 阻塞
 *
 * 线程提供了一个静态方法：
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程进入阻塞状态指定毫秒。
 * 超时后线程会自动回到RUNNABLE状态等待再次获取时间片并发运行
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        /*
            程序启动后，要求用户驶入一个数字，然后每秒递减，到0时输出时间到
         */
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt()*1000;
        try {
            Thread.sleep(input);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("程序结束了");
    }
}
