package integer;

/**
 * @author Hollow
 * @create 2020/12/23 0023 16:33
 * 8个基本类型有对应的8个包装类
 * 包装类出现的目的是为了解决基本类型不能直接参与面向对象开发的问题，使得我们可以以“对象”的形式表示一个基本数据类型
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        //基本类型转换为其对应的包装类

        //java推荐使用valueOf创建包装类；
        Integer in1 = Integer.valueOf(1);
        Integer in2 = Integer.valueOf(1);
        System.out.println(in1 == in2);
        System.out.println(in1.equals(in2));


        //包装类转化为基本类型
        int d = in1.intValue();
        System.out.println(d);

        double dou = in1.doubleValue();
        System.out.println(dou);
    }

}
