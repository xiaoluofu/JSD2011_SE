package integer;

/**
 * @author Hollow
 * @create 2020/12/23 0023 17:03
 * 包装类提供的一些功能
 */
public class IntergerDemo2 {
    public static void main(String[] args) {
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);
        long lmin = Long.MIN_VALUE;
        System.out.println(lmin);

        double bmax = Double.MAX_VALUE;
        System.out.println(bmax);
        double bmin = Double.MIN_VALUE;
        System.out.println(bmin);

        char cmax = Character.MAX_VALUE;
        System.out.println((int)cmax);
        char cmin = Character.MIN_VALUE;
        System.out.println((int)cmin);

        String str = "123";
        //String str = 123.1253;
        /*
             对于123.1253而言，Integer就不能将它解析为整数了，会抛出异常
             因此注意：包装类在解析字符串时要求该字符串必须正确的描述了基本类型可以保存的值
             否则会抛出NumberFormatException.即：数字格式异常
         */
        int i = Integer.parseInt(str);
        System.out.println(i);
        double dou = Double.parseDouble(str);
        System.out.println(dou);
    }
}
