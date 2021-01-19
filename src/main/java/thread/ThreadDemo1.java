package thread;

/**
 * @author Hollow
 * @create 2020/12/31 0031 10:27
 * 多线程
 * 多线程将我们的程序代码的执行方式从单一的顺序执行改成了多个代码片段可以并发("同时")执行，
 * 使得这些代码片段的执行时互不干扰的。
 *
 * 创建线程的方式有两种。第一种：
 * 继承Thread并重写run方法，在run方法中定义该线程要执行的任务
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread1();
        Thread thread2 = new MyThread2();
        /*
            启动线程要调用线程的start方法，而不是直接调用run方法！
         */
        thread1.start();
        thread2.start();
    }
}

/**
 *第一种创建线程的方式优点在于：结构简单，使用匿名内部类创建方便
 * 但是也有两个不足：
 * 1：由于java时单继承的，这导致如果我们继承了Thread就无法在继承其他类，
 * 实际开发中我们经常因为复用方法而继承一个类，如果此时还需要继承线程，则出现了冲突
 * 2：定义线程的同时定义了线程要执行的任务，这导致线程与线程要执行的任务存在了一个耦合，不利于线程的复用
 */
class MyThread1 extends Thread{
    public void run(){
        for (int i =0;i<100;i++){
            System.out.println("wdnmd");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i =0;i<100;i++){
            System.out.println("fgnb");
        }
    }
}
