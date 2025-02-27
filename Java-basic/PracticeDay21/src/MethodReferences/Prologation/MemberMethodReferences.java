package MethodReferences.Prologation;

import java.util.ArrayList;
import java.util.Collections;

public class MemberMethodReferences {
    public static void main(String[] args) {
        //使用类名引用成员方法
        //格式:类名::成员方法
        //局限性:不能引用所有成员方法

        //练习:
        //集合里面有一些字符串,要求变成大写后进行输出
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");

        //规则:
        //1.需要有函数式接口
        //2.被引用的方法必须已经存在
        //3.被引用方法的形参,需要跟抽象方法的第二个形参到最后一个形参保持一致,返回值需要保持一致
        //4.被引用方法的功能需要满足当前的需求

        //抽象方法形参的详解:
        //第一个参数:表示被引用方法的调用者,决定了可以引用哪些类中的方法
        //         在Stream流中,第一个参数一般都表示流里面的每一个数据
        //         如假设流中的数据都是String,那么使用这种方式进行方法引用,只能引用String这个类中的方法
        //第二个参数到最后一个参数:跟引用方法的形参保持一致,如果没有第二个参数,说明被引用的方法需要是无参的成员方法

        //即拿着流中的每个数据取调用String类中的toUpperCase方法,方法的返回值就是转换之后的结果
        list.stream().map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
    }
}
