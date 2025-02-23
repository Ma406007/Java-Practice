package Collection.JavaList;

import java.util.ArrayList;
import java.util.List;

//List集合的特点:有序,有索引,可重复

public class JavaList {
    public static void main(String[] args) {
        //List继承了Collection中的方法
        //因为List有索引,所以还有它自己独特的方法
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //void add(int index, E element) 在此集合中的指定位置插入指定的元素,原来索引上的元素会依次向后移动
        list.add(1, "qqq");

        //E remove(int index) 删除指定索引处的元素,返回被删除的元素
        //细节:如果E为Integer,则在调用remove()方法时会优先调用remove(int index),而不会调用remove(Object obj)
        //因为这两个方法为重载关系,会优先调用实参和形参一致的方法,如果要调用remove(Object obj),需要找到要真正删除的元素的下标或者手动装箱(推荐后者)
        list.remove(1);

        //E set(int index, E element) 修改指定索引处的元素并返回被修改的元素
        list.set(1, "QQQ");

        //E get(int index) 返回指定索引处的元素
        String s = list.get(2);
        System.out.println(s);


        System.out.println(list);
    }
}
