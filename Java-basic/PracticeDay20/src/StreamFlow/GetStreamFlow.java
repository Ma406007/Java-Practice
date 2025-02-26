package StreamFlow;

//Stream流一般会结合Lambda表达式来简化集合,数组的操作

import java.util.*;
import java.util.stream.Stream;

public class GetStreamFlow {
    public static void main(String[] args) {
        //Stream流的使用步骤:
        //1.先得到一条Stream流(流水线),并把数据放上去
        //default Stream<E> stream() 单列集合的获取方式,Collection中的默认方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        list.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        //public static <T> Stream<T> stream(T[] array) 数组的获取方式,Arrays工具类中的静态方法
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arr).forEach(s -> System.out.print(s + " "));
        System.out.println();

        //public static <T> Stream<T> of(T...values) 一堆零散数据(同种数据类型)的获取方式,Stream接口中的静态方法
        //可以传入数组,但只能传引用数据类型的数组
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(s -> System.out.print(s + " "));
        System.out.println();

        //双列集合无法直接使用Stream流,需要获得key进行Stream的使用
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("aaa", 111);
        hashmap.put("bbb", 222);
        hashmap.put("ccc", 333);
        hashmap.put("ddd", 444);
        hashmap.put("eee", 555);

        //第一种方法:获取key
        Set<String> keySet = hashmap.keySet();
        keySet.stream().forEach(s -> System.out.print(s + ":" + hashmap.get(s) + " "));
        System.out.println();

        //第二种方法:获取Entry
        Set<Map.Entry<String, Integer>> entrySet = hashmap.entrySet();
        entrySet.stream().forEach(s -> System.out.print(s + " "));

        //2.使用中间方法(Stream流中的各种API)对流水线上的数据进行操作
        //3.使用终结方法(输出,打印)对流水线上的数据进行操作
    }
}
