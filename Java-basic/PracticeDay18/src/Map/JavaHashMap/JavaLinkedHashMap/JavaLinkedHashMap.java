package Map.JavaHashMap.JavaLinkedHashMap;

//LinkedHashMap特点
//1.由键决定特点:有序(存储和取出的元素顺序一致),不重复,无索引
//2.没有特别的方法,可以直接使用Map继承下来的方法
//3.底层原理与LinkedHashSet一致,底层数据结构是哈希表,只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序(注意put()方法的覆盖特性)

import java.util.LinkedHashMap;

public class JavaLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("A", 123);
        linkedHashMap.put("A", 123);
        linkedHashMap.put("B", 456);
        linkedHashMap.put("C", 789);

        System.out.println(linkedHashMap);
    }
}
