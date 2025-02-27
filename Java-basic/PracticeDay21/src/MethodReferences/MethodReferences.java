package MethodReferences;

import java.util.*;

public class MethodReferences {
    public static void main(String[] args) {
        //需求:创建一个数组并进行倒序排列
        Integer[] arr = {3, 5, 1, 6, 4, 2};

        //匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //Lambda表达式
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        //方法引用:把已经有的方法拿过来用,当做函数式接口中抽象方法的方法体
        //1.引用处必须是函数式接口
        //2.被引用方法必须已经存在
        //3.被引用方法的形参和返回值需要和抽象方法保持一致
        //4.被引用方法的功能要满足当前需求

        //表示引用MethodReferences类里面的subtraction()方法
        //把这个方法当做抽象方法的方法体
        //方法引用: 类名::被引用方法名
        Arrays.sort(arr, MethodReferences::subtraction);
    }

    //被引用方法可以是Java已经写好的,也可以是一些第三方的工具类
    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
