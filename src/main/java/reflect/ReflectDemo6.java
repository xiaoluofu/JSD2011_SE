package reflect;

import java.lang.reflect.Method;

/**
 * 访问私有成员
 */
public class ReflectDemo6 {
    public static void main(String[] args) {

        try {
            Class<?> cls = Class.forName("reflect.Person");
            Object o = cls.newInstance();

            //获取方法hello
//            cls.getMethod("hello");//获取不到私有方法
            //获取本类定义的方法，包含私有方法
            Method m = cls.getDeclaredMethod("hello");
            m.setAccessible(true);//强行设置为可访问
            m.invoke(o);//所以说外部是可以访问一个类中的私有方法，利用反射，
                        //但是不推荐这么实用，会破坏其封装性

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
