import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //数组和集合的区别
        //数组长度固定,集合长度可变
        //数组可以存储基本数据类型和引用数据类型,集合只能存储引用数据类型,如果要存储基本数据类型,需要存储对应的包装类

        //创建集合对象
        //泛型:限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<>();
        //JDK7以后:
        ArrayList<String> List = new ArrayList<>();

        //成员方法:增删查改
        //boolean add(E e) 添加元素,返回值表示是否添加成功
        //boolean remove(E e) 删除指定元素,返回值表示是否删除成功
        //E remove(int index) 删除指定索引的元素,返回被删除元素
        //E set(int index, E e) 修改指定索引下的元素,返回原来的元素
        //E get(int index) 获取指定索引的元素
        //int size() 集合的长度,也就是集合中元素的个数

        //打印对象不是地址值,而是集合中存储数据内容
        //在展示时会拿[]把所有的数据进行包裹
        System.out.println(List);
    }
}
