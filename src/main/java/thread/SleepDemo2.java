package thread;

/**
 * sleep方法要求必须处理中断异常InterruptedException
 * 当一个线程调用该方法处于睡眠阻塞的过程中，其中断方法interrupt()被调用
 * 时，此时该线程的睡眠阻塞会被中断，sleep方法就会抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("林:刚美完容，睡一会吧...");
                try {
                    Thread.sleep(500000000);
                } catch (InterruptedException e) {
                    System.out.println("林:干嘛呢！干嘛呢！干嘛呢！都破了相了!");
                }
                System.out.println("林:醒了!");
            }
        };

        Thread huang = new Thread(){
            public void run(){
                System.out.println("黄:大锤80！小锤40！开始砸墙!");
                for(int i=0;i<5;i++){
                    System.out.println("黄:80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("咣当!");
                System.out.println("黄:搞定!");
                lin.interrupt();//中断lin线程的睡眠阻塞
            }
        };
        lin.start();
        huang.start();
    }
}
