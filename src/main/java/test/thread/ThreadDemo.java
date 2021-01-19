package test.thread;

public class ThreadDemo {
    public static void main(String[] args) {
//        Thread t1 = new Thread(){
//            public void run(){
//                for (int i=0;i<10000;i++){
//                    System.out.println("wdnmd");
//                }
//            }
//        };
        Thread t1 = new Thread(()->{for(int i =0;i<10000;i++) System.out.println("wdnmd");});
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10000;i++){
                    System.out.println("fgnb");
                }
            }
        };
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
