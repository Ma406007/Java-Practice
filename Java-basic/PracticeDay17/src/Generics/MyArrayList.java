package Generics;

import java.util.Arrays;

//当一个类中,某个变量的数据类型不确定时,就可以定义带有泛型的类(泛型类)
/*
  格式:
  修饰符 class 类名<类型> {

  }
*/

public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e) {
        obj[size++] = e;
        return true;
    }

    public E get(int index) {
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
