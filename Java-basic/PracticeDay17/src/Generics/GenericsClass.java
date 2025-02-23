package Generics;

import java.util.Arrays;

public class GenericsClass {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<String>();
        myArrayList.add("aaa");
        myArrayList.add("bbb");
        myArrayList.add("ccc");
        System.out.println(myArrayList);
    }
}

