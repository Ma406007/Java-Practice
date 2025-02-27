package MethodReferences.ConstructorMethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConstructorMethodReferences {
    public static void main(String[] args) {
        //引用构造方法
        //格式:类名::new

        //练习:
        //集合里存储姓名和年龄,比如:张无忌,15
        //要求:将数据封装成Student对象并收集到List集合中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100",
                "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");

        List<Student> list1 = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
            }
        }).collect(Collectors.toList());
        for (Student student : list1) {
            System.out.print(student.getName() + "," + student.getAge() + " ");
        }
        System.out.println();

        List<Student> list2 = list.stream().map(Student::new)
                .collect(Collectors.toList());
        for (Student student : list2) {
            System.out.print(student.getName() + "," + student.getAge() + " ");
        }
    }
}