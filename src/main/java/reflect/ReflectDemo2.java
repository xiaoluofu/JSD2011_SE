package reflect;

import java.util.Scanner;

/**
 * 实例化操作
 */
public class ReflectDemo2 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);


        try {
            //1:要加载实例化对象的类对象
//            Class cls = Class.forName("reflect.Person");

            Scanner scan = new Scanner(System.in);
            System.out.println("请输入你想要实例化的类名:");
            String className = scan.nextLine();
            Class cls = Class.forName(className);


            //2:类对象提供了实例化对象的方法
            Object o = cls.newInstance();//注意：必须由无参构造器，并且是public的
            System.out.println(o);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
