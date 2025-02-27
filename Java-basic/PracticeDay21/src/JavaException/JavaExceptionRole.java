package JavaException;

public class JavaExceptionRole {
    //异常的作用:
    //1.查询bug的关键参考信息
    //2.可以作为方法内部的一种特殊返回值,以便通知调用者底层的执行情况

    public static void main(String[] args) {
        //NullPointerException
        //Student[] students = new Student[3];
        //String name = students[0].getName();
        //System.out.println(name);

        Student student = new Student();
        student.setAge(10);
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
        if (age < 18 || age > 40) {
            throw new RuntimeException();
        }
        else {
            this.age = age;
        }
    }
}
