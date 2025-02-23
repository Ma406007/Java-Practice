package Generics;

import java.util.ArrayList;

public class GenericsMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ListUtil.addAll(list, "aaa", "bbb", "ccc", "ddd");
        System.out.println(list);
    }
}
