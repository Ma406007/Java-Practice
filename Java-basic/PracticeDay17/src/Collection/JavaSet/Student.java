package Collection.JavaSet;

import java.util.Objects;

public class Student implements Comparable<Student> {
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        //this表示当前要添加的元素
        //o表示已经在红黑树存在的元素
        int result = this.getAge() - o.getAge();
        //返回值为负数,认为要添加的元素是较小值,存左边
        //返回值为正数,认为要添加的元素是较大值,存右边
        //返回值为0,认为要添加的元素已经存在,需要舍弃
        return result;
    }
}
