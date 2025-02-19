package CommonAPI;

//Objects是一个工具类,提供一些方法去完成一些功能

import java.util.Objects;

public class JavaObjects {
    //public static boolean equals(Object a, Object b) 先做非空判断再比较两个对象
    //public static boolean isNull(Object obj) 判断对象是否为null,是返回true,不是返回false
    //public static boolean nonNUll(Object obj) 判断对象是否为null,跟isNull的结果相反

    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student("zhangsan", 23);

        //如果equals()方法没有重写比较的就是地址值,注意根据需求选择重写
        boolean result = Objects.equals(s1, s2);
        System.out.println(result);
    }
}
