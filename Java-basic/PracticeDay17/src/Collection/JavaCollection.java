package Collection;

import java.util.Collection;

//Java中集合分为两大类:单列集合Collection和双列集合Map(都是接口)
//本package主要是单列集合

//Collection又分为List和Set(都是接口)
//List系列集合:添加的元素是有序的,可重复的,有索引的 分为ArrayList,LinkedList,Vector(都是实现类)
//Set系列集合:添加的元素是无序的,不重复的,无索引的 分为HashSet和TreeSet,HashSet又有子类LinkedHashSet(都是实现类)

public class JavaCollection {
    //Collection是单列集合的祖宗接口,其功能是全部单列集合都可以继承使用的
    public static void main(String[] args) {
        //public boolean add(E e) 把给定的对象添加到当前集合中
        //public void clear() 清空集合中所有的元素
        //public boolean remove(E e) 把给定的对象在当前集合中删除
        //public boolean contains(Object obj) 判断当前集合中是否包含给定的对象(依靠equals()方法实现,如果是自定义JavaBean类需要进行equals()方法重写)
        //public boolean isEmpty() 判断当前集合是否为空
        //public int size() 返回集合中元素的个数/集合的长度
    }
}
