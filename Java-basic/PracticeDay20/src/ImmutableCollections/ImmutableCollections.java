package ImmutableCollections;

//不可变集合,顾名思义就是内容不可修改的集合
//应用场景:
//1.如果某个数据不能被修改,把它防御性地拷贝到不可变集合中是个很好的实践
//2.当集合对象被不可信的库调用时,不可变形式是安全的

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollections {
    public static void main(String[] args) {
        //List,Set,Map接口中都存在静态的of()方法,可以通过这个方法来获取一个不可变的集合
        //创建不可变集合(不可添加,不可删除,不可修改,只能查询)
        //static <E> List<E> of(E...elements) 创建一个具有指定元素的List集合对象
        List<String> list = List.of("zhangsan", "lisi", "wangwu", "zhaoliu");
        //static <E> Set<E> of(E...elements) 创建一个具有指定元素的Set集合对象
        Set<String> set = Set.of("zhangsan", "lisi", "wangwu", "zhaoliu");
        //static <K, V> Map<K, V> of(E...elements) 创建一个具有指定元素的Map集合对象 键不可重复,且参数有上限(最多传入20个参数即10个键值对)
        Map<String, Integer> map1 = Map.of("zhangsan", 1, "lisi", 2, "wangwu", 3,"zhaoliu", 4);

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("张三", "南京");
        hashmap.put("李四", "北京");
        hashmap.put("王五", "上海");
        hashmap.put("赵六", "北京");
        hashmap.put("孙七", "深圳");
        hashmap.put("周八", "杭州");
        hashmap.put("吴九", "宁波");
        hashmap.put("郑十", "苏州");
        hashmap.put("刘一", "无锡");
        hashmap.put("陈二", "嘉兴");
        hashmap.put("aaa", "111");

        //获取键值对存入Set集合中
        Set<Map.Entry<String, String>> entries = hashmap.entrySet();
        //toArray方法会比较集合和数组长度大小关系,集合长度大于数组长度就会创建新数组,集合长度小于等于数组长度不会变动,这里创建一个长度为0的数组就是为了起到一个自动扩容的作用
        Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
        //不可变的集合map2
        //static <K, V> Map<K, V> ofEntries(Entry<? extends K, ? extends V>...entries) 如果要传入多个键值对对象(数量大于10) 无copyOf可用
        Map map2 = Map.ofEntries(arr);
        System.out.println(map2);

        //不可变集合map3
        //static <K, V> copyOf(Map<? extends K, ? extends V> map) 直接创建不可变Map集合(JDK10后)
        Map<String, String> map3 = Map.copyOf(hashmap);
        System.out.println(map3);
    }
}
