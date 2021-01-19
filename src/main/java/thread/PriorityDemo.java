package thread;

/**
 * @author Hollow
 * @create 2020/12/31 0031 16:42
 * 线程的优先级
 * 线程的优先级分为10个等级，分别用整数1-10表示
 * 其中1位最低优先级，5为默认优先级，10为最高优先级
 *
 * 当线程调用start方法后就纳入到线程调度器中统一管理，此时线程只能被动的被分配时间片进行并发运行
 * 但是优先级越高的线程获取CPU时间片的次数就越多（处于一个CPU核心中的线程）
 * 因此通过调整线程的优先级可以最大程度的改善线程获取CPU时间片的概率
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                for (int i =0;i<10000;i++){
                    System.out.println("wdnmd");
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                for (int i =0;i<10000;i++){
                    System.out.println("fgnb");
                }
            }
        };
        Thread t3 = new Thread(){
            @Override
            public void run(){
                for (int i =0;i<10000;i++){
                    System.out.println("法国南部");
                }
            }
        };
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
