package Collection;

//迭代器Iterator是Java中的一个类,是集合专用的遍历方式

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        //Collection集合获取迭代器
        //Iterator<E> iterator() 返回迭代器对象,默认指向当前集合的0索引

        //Iterator中常用方法
        //boolean hasNext() 判断当前位置是否有元素,有元素返回true,没有元素返回false
        //E next() 获取当前位置的元素,并将迭代器对象移向下一个位置

        Collection<String> collection = new ArrayList<>();

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        //注意点:
        //1.如果Iterator指向的元素不存在,这时候强行访问会报错:NoSuchElementException
        //2.迭代器遍历完毕后指针不会复位,若要遍历第二次或多次,需要再创建Iterator对象
        //3.循环中只能使用一次next()方法
        //4.迭代器遍历时,不能用集合的方法进行增加或者删除,如果要删除需要使用Iterator中的remove()方法
    }
}
