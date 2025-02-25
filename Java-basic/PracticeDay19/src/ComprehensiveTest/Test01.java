package ComprehensiveTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test01 {
    /*
      需求:
      班级里有N个学生,学生属性:姓名,年龄,性别
      实现随机点名
    */

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23, "男");
        Student s2 = new Student("lisi", 24, "女");
        Student s3 = new Student("wangwu", 25, "男");
        Student s4 = new Student("zhaoliu", 26, "男");
        Student s5 = new Student("qianqi", 27, "女");
        Student s6 = new Student("ergou", 28, "男");

        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, s1, s2, s3, s4, s5, s6);

        Random random = new Random();
        int index = random.nextInt(list.size());
        System.out.println(list.get(index).getName());
    }
}

class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {}
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
