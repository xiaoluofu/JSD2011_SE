package exception;

/**
 * @author Hollow
 * @create 2020/12/30 0030 9:19
 * 测试异常的抛出
 */
public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        Person p = new Person();
        try {
            //满足语法，但是不满足业务的情况
            p.setAge(50000);
        } catch (IllegalAgeExeception e) {
            e.printStackTrace();
        }
        System.out.println("此人年龄："+p.getAge());
        System.out.println("程序结束了");
    }
}
