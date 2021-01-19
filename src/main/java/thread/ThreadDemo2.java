package thread;

/**
 * @author Hollow
 * @create 2020/12/31 0031 11:13
 * 第二种创建线程的方式：
 * 实现了Runnable接口单独定义线程任务
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //先创建线程任务
        Runnable runnable1 = new MyRunnable1();
        Runnable runnable2 = new MyRunnable2();
        //创建线程并将任务交给线程
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println("wdnmd");
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println("fgnb");
        }
    }
}
