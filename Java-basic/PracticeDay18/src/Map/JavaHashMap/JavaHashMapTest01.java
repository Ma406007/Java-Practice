package Map.JavaHashMap;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.Map;

public class JavaHashMapTest01{
    /*
      需求:
      创建一个HashMap集合,键是学生对象(Student),值是籍贯(String)
      存储三个键值对元素并遍历
      要求:同姓名,同年龄认为是同一个学生
    */

    public static void main(String[] args) {
        HashMap<Student, String> students = new HashMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        students.put(s1, "qingdao");
        students.put(s2, "shanghai");
        students.put(s3, "shenzhen");

        //键找值
        Set<Student> keys = students.keySet();
        for (Student key : keys) {
            String value = students.get(key);
            System.out.println(key.getName() + " " + key.getAge() + ":" + value);
        }
        System.out.println();

        //键值对
        Set<Map.Entry<Student, String>> entries = students.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key.getName() + " " + key.getAge() + ":" + value);
        }
        System.out.println();

        //Lambda表达式
        students.forEach((k, v) -> System.out.println(k.getName() + " " + k.getAge() + ":" + v));

    }
}

class Student {
    private String name;
    private int age;

    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}