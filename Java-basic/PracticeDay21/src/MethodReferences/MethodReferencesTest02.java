package MethodReferences;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodReferencesTest02 {
    /*
      练习:
      创建集合添加学生对象,学生对象属性:name, age
      只获取姓名并放到数组中
    */

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张无忌", 15));
        list.add(new Student("周芷若", 14));
        list.add(new Student("赵敏", 13));
        list.add(new Student("张强", 20));
        list.add(new Student("张三丰", 100));
        list.add(new Student("张翠山", 40));
        list.add(new Student("张良", 35));
        list.add(new Student("王二麻子", 37));
        list.add(new Student("谢广坤", 41));

        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
