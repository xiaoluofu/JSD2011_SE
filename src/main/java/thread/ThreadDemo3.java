package thread;

/**
 * @author Hollow
 * @create 2020/12/31 0031 11:26
 * 使用匿名内部类完成两种线程的创建方法
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                for (int i =0;i<100;i++){
                    System.out.println("wdnmd");
                }
            }
        };
//        Runnable r2 = ()->{ for (int i =0;i<100;i++) System.out.println("fgnb"); };
        Thread t2 = new Thread(()->{ for (int i = 0; i<100; i++) System.out.println("fgnb"); });

        t1.start();
        t2.start();
    }
}
