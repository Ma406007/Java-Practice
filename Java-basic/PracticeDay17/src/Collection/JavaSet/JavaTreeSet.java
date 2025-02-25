package Collection.JavaSet;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet的特点:不重复,无索引,可排序(按照元素的默认规则(由小到大)进行排序)
//TreeSet集合底层基于红黑树实现排序,增删查改性能都较好

public class JavaTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts =  new TreeSet<>();

        ts.add(4);
        ts.add(1);
        ts.add(5);
        ts.add(3);
        ts.add(2);

        //System.out.println(ts);

        //迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.print(i + " ");
        }
        System.out.println();

        //增强for遍历
        for (Integer t : ts) {
            System.out.print(t + " ");
        }
        System.out.println();

        //Lambda表达式遍历
        ts.forEach(t -> System.out.print(t + " "));
    }
}
