package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

//Collections是集合工具类,内部含有集合的各种方法

public class JavaCollections {
    public static void main(String[] args) {
        //Collections常用API
        //public static <T> boolean addAll(Collection<T> c, T...elements) 批量添加元素
        //public static void shuffle(List<?> list) 打乱List集合元素的顺序

        //Collections其他可用方法
        //public static <T> void sort(List<T> list) 排序
        //public static <T> void sort(List<T> list, Comparator<T> c) 根据指定的规则进行排序
        //public static <T> int binarySearch(List<T> list, T key) 以二分查找法查找元素
        //public static <T> void copy(List<T> dest, List<T> src) 拷贝集合中的元素
        //public static <T> int fill(List<T> list, T obj) 使用指定元素填充集合
        //public static <T> void max/min(Collection<T> coll) 根据默认的自然排序获得最大/最小值
        //public static <T> void swap(List<?> list, int i, int j) 交换集合中指定位置的元素

        ArrayList<String> list = new ArrayList<String>();

        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
