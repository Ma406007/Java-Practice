package MethodReferences.Prologation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayMethodReferences {
    public static void main(String[] args) {
        //引用数组的构造方法
        //格式:数据类型[]::new

        //练习:
        //集合中存储一些整数,收集到数组当中
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        Integer[] arr = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
