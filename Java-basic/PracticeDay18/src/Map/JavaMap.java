package Map;

//Java中集合分为两大类:单列集合Collection和双列集合Map(都是接口)
//本package主要是双列集合

//双列集合的特点:
//1.双列集合一次需要存一对数据,分别为键和值
//2.键不能重复,值可以重复
//3.键和值是一一对应的关系,每一个键只能找到自己对应的值
//4.键+值这个整体称之为"键值对"或者"键值对对象",在Java中叫做"Entry对象"

//Map又分为HashMap,HashTable和TreeMap(都是接口)

import java.util.HashMap;
import java.util.Map;

public class JavaMap {
    public static void main(String[] args) {
        //Map是双列集合的顶层接口,其方法是全部双列集合都可以继承使用的
        Map<String, String> map = new HashMap<>();

        //V put(K key, V value) 添加/覆盖元素 添加数据时如果键不存在会直接把键值对添加到map中并返回null,如果存在就会把原有键值对覆盖并返回被覆盖的值
        map.put("郭靖", "黄蓉");
        map.put("韦小宝", "沐剑屏");
        map.put("尹志平", "小龙女");

        //V remove(Object key) 根据键来删除键值对元素并返回对应的值
        //String value = map.remove("郭靖");
        //System.out.println(value);

        //void clear() 移除所有的键值对元素
        //map.clear();

        //boolean containsKey(Object key) 判断集合是否包含指定的键
        boolean result1 = map.containsKey("郭靖");
        System.out.println(result1);

        //boolean containsValue(Object value) 判断集合是否包含指定的值
        boolean result2 = map.containsValue("小龙女");
        System.out.println(result2);

        //boolean isEmpty() 判断集合是否为空
        boolean result3 = map.isEmpty();
        System.out.println(result3);

        //int size() 返回集合的长度/集合中键值对的个数
        int result4 = map.size();
        System.out.println(result4);

        System.out.println(map);
    }
}
