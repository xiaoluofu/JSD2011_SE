package reflect;

import java.lang.reflect.Method;

/**
 * 反射机制
 * 反射是java中动态机制，允许我们实例化对象，操作属性调用方法这些工作从原来的编码期间确定
 * 转为在程序运行期间确定。
 * 反射可以大大提高代码的灵活度，但是也回带来更多的开销
 * 因此我们不能过度的使用反射机制。
 */
public class ReflectDemo1 {
    public static void main(String[] args) {
        /*
            类对象，Class的实例
            在JVM中每个被加载的类都有且只有一个Class的实例与之对应，获取这个类的类对象就可以通过
            它来了解其表示的类的一切信息:类名，有哪些属性，构造器，方法等等。
            并可以在程序运行过程中动态的去进行相关操作

                获取一个类的类对象方法:
                1:类名.class 例如:
                    Class cls = String.class;
                    Class cls = int.class;
                    注:基本类型只能通过上述方法获取到类对象
    
                2:Class.forName(String className) 例如:
                  Class cls = Class.forName("java.lang.String");
                  Class cls = Class.forName("java.util.ArrayList");
    
                3:类加载器ClassLoader
         */

        //加载String类对象
//        Class cls = String.class;
        try {
            //要指定类的完全限定名:包名.类名
            //Class cls = Class.forName("java.lang.reflect.Method");
            //Class cls = Class.forName("java.lang.String");
            Class cls = Class.forName("reflect.Person");

            //通过类对象获取其表示的类的名字
            String name = cls.getName();//含有包名
            System.out.println(name);//reflect.Person
            name = cls.getSimpleName();//不含有包名
            System.out.println(name);//Person

            //通过类对象获取该类中所有公开方法(包含从超类继承的)
            Method[] methods = cls.getMethods();
            System.out.println("一共有:"+methods.length+"个方法");
            for (Method m:methods){
                System.out.println(m.getName());
            }


        } catch (ClassNotFoundException e) {
            //当指定的类的完全限定名不对是，Class.forName()方法会抛出该异常
            e.printStackTrace();
        }

    }
}
