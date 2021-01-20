package thread;

import java.util.Scanner;

/**
 * sleep阻塞
 *
 * 线程提供了一个静态方法:
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程进入阻塞状态指定毫秒。超时后线程会自动
 * 回到RUNNABLE状态等待再次获取时间片并发运行
 *
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = scanner.nextInt();
        for(;num>0;num--) {
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("时间到!");
        System.out.println("程序结束了!");
    }
}










