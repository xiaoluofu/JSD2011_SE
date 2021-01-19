package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合之间的操作
 *
 *
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        /*
            JDK5之后，java推出了一个新特性：泛型
            泛型也称为参数化类型，可以让我们在使用一个类时通过其声明的泛型来指定其内部某个属性或方法的参数
            或返回值类型，使得使用起来更加灵活
            泛型在集合中大量应用，目的是在使用集合是目的是指定集合中的元素类型

            泛型只能指定为引用类型，对于基本数据类型而言要指定对应的包装类
            如果泛型不指定，则使用默认值为object
         */

//        Collection<String> c1 = new ArrayList<>();//list可以放重复元素

        Collection<String> c1 = new HashSet<>();//set不能放重复元素

        /*
            boolean add(E e)
         */
        c1.add("java");//编译器会检查实际传入的参数是否为E指定的实际类型
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1"+c1);

        Collection<String> c2= new ArrayList<>();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println(c2 +"c2");
        /*
            boolean addAll(Collection c)
            将给定集合中的所有元素添加到当前集合中
            执行后当前集合发生类变化就返回true
         */
        System.out.println(c1.addAll(c2));
        System.out.println("c1" + c1);

        Collection<String> c3 = new ArrayList<>();
        c3.add("ios");
        c3.add("java");
        c3.add("php");
        System.out.println("c3"+c3);
        /*
            boolean containsAll(Collection c)
            判断当前集合是否包含给定集合中的所有元素
         */
        boolean contains = c1.containsAll(c3);
        System.out.println("contains:"+contains);

        /*
            removeAll(Collection c)
            删除当前集合中给定集合中的共有元素(删除交集部分)。
            但是给定结合的元素不受影响
         */
        c1.removeAll(c3);
        System.out.println("c1:"+c1);
        System.out.println("c3:"+c3);



    }
}
