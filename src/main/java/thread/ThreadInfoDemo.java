package thread;

/**
 * @author Hollow
 * @create 2020/12/31 0031 16:30
 *
 * 获取线程相关信息的方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        //获取线程的名称
        String name = main.getName();
        System.out.println("name:"+name);
        //获取线程的唯一标识
        long id = main.getId();
        System.out.println("id:"+id);
        //获取线程的优先级
        int priority = main.getPriority();
        System.out.println("优先级:"+priority);
        //线程是否活着
        main.isAlive();
        //线程是否为守护线程
        main.isDaemon();
        //线程是否被中断了
        main.isInterrupted();

        System.out.println("isAlive:"+ main.isAlive());
        System.out.println("isDaemon:"+ main.isDaemon());
        System.out.println("isInterrupted"+main.isInterrupted());

    }
}
