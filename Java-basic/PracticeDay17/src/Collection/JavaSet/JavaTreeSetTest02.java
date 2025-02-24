package Collection.JavaSet;

import java.util.Comparator;
import java.util.TreeSet;

public class JavaTreeSetTest02 {
    public static void main(String[] args) {
        //匿名内部类
//        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //按照长度排序
//                int i = o1.length() - o2.length();
//                //如果一样长就按照首字母排序(默认规则)
//                i = i == 0 ? o1.compareTo(o2) : i;
//                return i;
//            }
//        });

        //Lambda表达式
        TreeSet<String> treeSet = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
        });

        treeSet.add("c");
        treeSet.add("ab");
        treeSet.add("df");
        treeSet.add("qwer");

        System.out.println(treeSet);
    }
}
