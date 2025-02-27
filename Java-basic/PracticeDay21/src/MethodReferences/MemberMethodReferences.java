package MethodReferences;

import java.util.ArrayList;
import java.util.Collections;

public class MemberMethodReferences {
    public static void main(String[] args) {
        //引用成员方法
        //格式:对象::成员方法
        //1.其他类:其它类对象::方法名
        //2.本类:this::方法名(注意静态方法中无this,只能创建新对象然后再引用)
        //3.父类:super::方法名

        //练习1:集合中有一些名字,按照要求过滤数据
        //数据:"张无忌", "周芷若", "赵敏", "张强", "张三丰"
        //要求:只要以张开头,而且名字是三个字的
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        list.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        list.stream().filter(new StringOperation()::stringJudge)
                .forEach(s -> System.out.print(s + " "));

        //练习2:GUI界面中点击事件的方法引用写法
    }
}

class StringOperation {
    public boolean stringJudge(String str) {
        return str.startsWith("张") && str.length() == 3;
    }
}
