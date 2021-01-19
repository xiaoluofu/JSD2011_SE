package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 调用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) {
        Person p = new Person();
        p.sayHello();

        try {
//            Class<?> cls = Class.forName("reflect.Person");
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入类名：");
            String name = scan.nextLine();
            System.out.println("请输入方法名");
            String methodName = scan.nextLine();

            Class<?> cls = Class.forName(name);


            Object o = cls.newInstance();

            //获取sayHello方法
            //Method method = cls.getMethod("sayHello");
            Method method = cls.getMethod(methodName);
            method.invoke(o);//p.sayHello //invoke需要传个对象类型的参数


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
