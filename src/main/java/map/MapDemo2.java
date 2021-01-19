package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 * Map提供了三种遍历方式：
 * 1:遍历所有的key
 * 2:遍历所有的键值对
 * 3:遍历所有的value(该操作相对不常用)
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("地理", 60);
        map.put("语文",90);
        map.put("数学",80);
        map.put("英语",70);
        map.put("政治",99);
        System.out.println(map);//{政治=99, 数学=80, 语文=90, 英语=70, 地理=60}
        /*
            遍历Map中所有的key
            Set keySet()
            将当前Map中所有的key以一个Set集合形式返回
         */
        Set<String> keySet = map.keySet();
        for (String str : keySet){
            System.out.println("key:"+str);
        }

        /*
            遍历每一组键值对
            Set<Entry> entrySet()
            将当前Map中的每一组键值对(一个Entry实例)存入一个Set集合
            并将其返回
            java.util.Map.Entry 他的每一个实例表示Map中一组键值对
         */
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> e : entrySet){
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);
        }
        /*
            遍历所有的value
            Collection values()
            将当前Map中所有的value以一个集合形式返回
         */
        Collection<Integer> values = map.values();
        for (Integer value : values){
            System.out.println("value:"+value);
        }

    }
}
