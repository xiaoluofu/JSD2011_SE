package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表
 * Map是非常常用的数据结构，它体现的样子是一个多行两列的表格
 * 左列称为key。右列称为value
 * Map总是根据key获取对应的value
 *
 * 常用实现类:java.util.HashMap 使用散列算法实现的Map，一般称他为散列表或哈希表
 *          他也是当今查询速度最快的数据结构
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        /*
            V put(K k, V v)
            将一组键值对存入Map中

            Map有一个要求:key不允许重复(equals比较)
            如果使用重复的key存入value时则是替换value操作。那么put方法的返回值
            为这个key原来的value
            如果这个key不存在则返回值为null

            获取put方法返回值时，如果Value的类型是包装类，那么尽量不要用基本类型去接受，
            因为方法可能返回null，如果出现自动拆箱会导致空指针
         */
        Integer num = map.put("地理", 60);
        map.put("语文",90);
        map.put("数学",80);
        map.put("英语",70);

        System.out.println(num);//null
        map.put("政治",99);
        System.out.println(map);//{政治=99, 数学=80, 语文=90, 英语=70, 地理=60}

        num = map.put("地理", 50);
        System.out.println(num);//60

        /*
            V get(Object key)
            根据key获取Map中对应的value
            如果给定的key不存在则返回值为null
         */
        num = map.get("地理");
        System.out.println(num);//50

        num = map.get("体育");
        System.out.println(num);//null

        /*
            V remove(Object key)
            删除Map中给定的key所对应的键值对，返回值为这个key所对应的value
         */
        num = map.remove("英语");
        System.out.println(map);//{政治=99, 数学=80, 语文=90, 地理=50}
        System.out.println(num);//70

        //获取Map中的元素个数
        int size = map.size();
        System.out.println("size:"+size);//size:4

        //判断Map是否包含给定的key
        boolean ck = map.containsKey("地理");
        System.out.println("包含key:"+ck);//包含key:true
        //判断Map是否包含给定的value
        boolean cv = map.containsValue("80");
        System.out.println("包含value:"+cv);//包含value:false
    }
}
