package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用有参构造器进行实例化
 */
public class ReflectDemo3 {
    public static void main(String[] args) {
        Person p = new Person("苍老师",55);
        System.out.println(p);

        try {
            Class<?> cls = Class.forName("reflect.Person");
//            Constructor<?> c = cls.getConstructor();//不传参获取的就是无参构造器
            //使用该构造器实例化:public Person(String name,int age)
            Constructor<?> c = cls.getConstructor(String.class, int.class);
            //new Person("茄子"，20)
            Object o = c.newInstance("茄子", 20);
            System.out.println(o);


        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
