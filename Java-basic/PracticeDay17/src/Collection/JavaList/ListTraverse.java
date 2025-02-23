package Collection.JavaList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTraverse {
    public static void main(String[] args) {
        //List共有五种遍历方式:迭代器,列表迭代器,增强for,Lambda表达式,普通for
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器
        System.out.println("1.迭代器遍历");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        //2.增强for
        System.out.println("2.增强for遍历");
        for (String s: list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println();

        //3.Lambda表达式
        System.out.println("3.Lambda表达式遍历");
        list.forEach(t -> System.out.print(t + " "));
        System.out.println();
        System.out.println();

        //4.普通for
        System.out.println("4.普通for遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        //5.列表迭代器
        System.out.println("5.列表迭代器");
        //获取列表迭代器对象,指针也是默认指向0索引
        //额外添加了一个方法:在使用列表迭代器的过程中可以添加元素(使用迭代器的方法)
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String str =  listIterator.next();
            if (str.equals("ddd")) {
                listIterator.add("eee");
            }
        }
        System.out.println(list);
        System.out.println();
        System.out.println();

        //五种遍历对比
        //如果在遍历的过程中需要删除元素,使用迭代器
        //如果在遍历的过程中需要添加元素,使用列表迭代器
        //如果仅仅想遍历,使用增强for或Lambda表达式
        //如果遍历的时候想操作索引,使用普通for
    }
}
