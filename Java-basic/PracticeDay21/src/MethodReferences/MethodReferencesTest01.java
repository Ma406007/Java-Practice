package MethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;

public class MethodReferencesTest01 {
    /*
      练习:
      集合中存储一些字符串的数据,比如张三,23
      收集到Student类型的数组中
    */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100",
                "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");

        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);

        for (Student student : arr) {
            System.out.print(student.getName() + "," + student.getAge() + " ");
        }
    }
}
