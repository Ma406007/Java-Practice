package MethodReferences;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StaticMethodReferences {
    public static void main(String[] args) {
        //引用静态方法
        //格式:类名::静态方法

        //练习:集合中有以下数字,要求把他们都变成int类型
        //"1" "2" "3" "4" "5"

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s -> System.out.print(s + " "));
        System.out.println();

        list.stream().map(Integer::parseInt)
                .forEach(s -> System.out.print(s + " "));
    }
}
