package string;

/**
 * @author Hollow
 * @create 2020/12/23 0023 10:17
 * StringBuilder
 * 由于String的优化完全是基于重用性考虑的，带来的问题是频繁的修改会产生内存开销大，运行速度慢等问题
 * 为了解决这些问题，java推出了一个而专门用来 修改字符串的API:StringBulider
 * StringBulider内部维护一个可变的char数组，修改某个字符串时会先将该字符串内容复制到内部的数组
 * 中然后进行修改。并且提供了便于修改字符串的相关操作：增删改插，以及String中操作字符串的功能
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //默认表示一个空字符串
//      StringBuilder builder = new StringBuilder();

        String str = "好好学习";
        //将给定的字符串内容复制到StringBuilder内部，基于它进行修改
        StringBuilder builder = new StringBuilder(str);
        /*
              好好学习
              好好学习天天向上
              append():追加操作
         */
        builder.append("天天向上");
        String s = builder.toString();
        System.out.println(s);//好好学习天天向上

        /*
              好好学习天天向上
              好好学习才是王道
              replace():替换将指定范围内的字符串替换为给定字符串
              含头不含尾
         */
        builder.replace(4,8,"才是王道");
        System.out.println(builder.toString());//好好学习才是王道

        /*
              好好学习才是王道
              好好学习
              delete():删除，删除指定范围内的字符串
         */
        builder.delete(4,8);
        System.out.println(builder.toString());//好好学习

        /*
               好好学习
               我要好好学习
               insert():在指定位置插入指定字符串
         */
        builder.insert(0,"我要");
        System.out.println(builder.toString());//我要好好学习



    }
}
