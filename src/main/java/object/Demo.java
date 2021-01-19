package object;

/**
 * @author Hollow
 * @create 2020/12/23 0023 15:39
 * 测试Object中常被重写的toString和equals方法的作用
 */
public class Demo {
    public static void main(String[] args) {
        Point p = new Point(5,6);
        /*
             System.out.println(Object o);
             该方法将给定对象输出到控制台时，会调用这个对象的toString方法将其转换为String后在进行输出
             如果输出一个对象到控制上的内容不符合你的预期时，就应当重写toString方法，再返回的字符串中包含
             你希望的数据，通常原则上应当包含该对象的属性信息

             Object的toString默认返回的格式为：类名@地址
         */
        System.out.println(p);
        /*
            String和任何类型链接结果都是字符串，当String和其他引用类型链接时，会调用该引用类型对象的toString方法
            将其转化为字符串后在进行链接。
         */
        String str = "wdnmd"+p;
        System.out.println(str);

        Point po = new Point(5,6);
        /*
            Object定义的equals方法意图是让子类在使用的时候重写来赋予其实际意义。
            这个方法应当是用来比较相同类型的两个实例内容是否一致的。
            但是Object本身的实现就是用"=="比较的，因此不重写就失去了实际意义。
         */
        System.out.println(po.equals(p));
    }
}
