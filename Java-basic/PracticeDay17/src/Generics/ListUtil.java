package Generics;

import java.util.ArrayList;

//当方法中形参类型不确定时,可以使用类名后面的定义的泛型<E>
//方法中形参类型不确定时,可以使用类名后面定义的泛型,或者在方法声明上定义自己的泛型
/*
  格式
  修饰符 <类型>返回值类型 方法名(类型 变量名) {

  }
*/

public class ListUtil {
    private ListUtil() {}

    static Object[] obj = new Object[10];
    static int size;

    public static<E> void addAll(ArrayList<E> list, E e1, E e2, E e3, E e4) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }
}
