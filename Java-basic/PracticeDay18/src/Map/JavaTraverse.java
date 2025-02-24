package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;


public class JavaTraverse {
    public static void main(String[] args) {
        //Map共有三种遍历方式
        Map<String, String> map = new HashMap<>();

        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        //1.键找值(增强for)
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.print(key + ":" + map.get(key) + " ");
        }
        System.out.println();

        //1.键找值(迭代器)
        Iterator<String> it1 = map.keySet().iterator();
        while (it1.hasNext()) {
            String key = it1.next();
            System.out.print(key + ":" + map.get(key) + " ");
        }
        System.out.println();

        //1.键找值(Lambda表达式)
        keys.forEach(key -> System.out.print(key + ":" + map.get(key) + " "));
        System.out.println();
        System.out.println();

        //2.键值对(增强for)
        Set<Map.Entry<String, String>> KeyValue = map.entrySet();
        for (Map.Entry<String, String> entry : KeyValue) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.print(key + ":" + value + " ");
        }
        System.out.println();

        //2.键值对(迭代器)
        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        Iterator<Map.Entry<String, String>> it3 = map.entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            String value = it3.next().getValue();
            System.out.print(key + ":" + value + " ");
        }
        System.out.println();

        //2.键值对(Lambda表达式)
        KeyValue.forEach(keyvalue -> System.out.print(keyvalue.getKey() + ":" + keyvalue.getValue() + " "));
        System.out.println();
        System.out.println();

        //3.Lambda表达式
        //default void forEach(BiConsumer<? super K, ? super V> action) 结合Lambda表达式直接遍历Map集合(不创建任何其他的对象)
        //匿名内部类形式
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.print(key + ":" + value + " ");
            }
        });
        System.out.println();

        //Lambda表达式形式
        map.forEach((key, value) -> System.out.print(key + ":" + value + " "));
    }
}
