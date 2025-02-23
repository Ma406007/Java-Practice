package Collection.JavaSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set系列集合
//无序:存取顺序不一致
//不重复:可以去除重复
//无索引:没有带索引的方法,所以不能使用普通for循环遍历,也不能通过索引来获取元素

//Set的实现类
//HashSet:无序,不重复,无索引
//LinkedHashSet:有序,不重复,无索引
//TreeSet:可排序,不重复,无索引

//Set接口中的方法基本上与Collection的API一致

public class SetTraverse {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("张三");
        set.add("李四");
        set.add("王五");

        //迭代器遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.print(str + " ");
        }
        System.out.println();

        //增强for遍历
        for (String s: set) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Lambda表达式遍历
        set.forEach(t -> System.out.print(t + " "));
    }
}
