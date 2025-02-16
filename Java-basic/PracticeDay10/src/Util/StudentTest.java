package Util;

import java.util.ArrayList;

public class StudentTest {
    //public:被虚拟机调用,访问权限足够大
    //static:被虚拟机调用,不用创建对象,直接访问各类.因为main方法是静态的,所以测试类中其他方法也需要是静态的
    //void:被虚拟机调用,不需要给虚拟机返回值
    //main:一个通用的名称,虽然不是关键字,但可以被虚拟机识别
    //String[] args:以前用于接收键盘录入,现在没用
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23, "男");
        Student s2 = new Student("李四", 24, "男");
        Student s3 = new Student("王五", 25, "女");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);


        System.out.println(StudentUtil.getMaxAge(students));
    }
}
