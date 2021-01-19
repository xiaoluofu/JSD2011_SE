package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池就是线程的管理机制，主要解决两个问题
 * 1:重用线程
 * 2:控制线程数量
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //1创建线程池
        //创建一个固定大小的线程池，容量为3
        ExecutorService threadpool = Executors.newFixedThreadPool(3);

        //2指派任务给线程池进行执行
        for (int i=0;i<6;i++){
            Runnable runn = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread t = Thread.currentThread();
                        System.out.println(t.getName() + ":正在执行任务");
                        Thread.sleep(5000);
                        System.out.println(t.getName()+":任务执行完毕");
                    } catch (InterruptedException e) {
                        System.out.println("中断了！");
                    }
                }
            };
            threadpool.execute(runn);
            System.out.println("指派了一个任务交给线程池");
        }
//        threadpool.shutdownNow();//会将当前所有线程直接关闭掉
        threadpool.shutdown();//会等线程所有任务结束后，关闭线程池
        System.out.println("线程池关闭了");


    }
}
