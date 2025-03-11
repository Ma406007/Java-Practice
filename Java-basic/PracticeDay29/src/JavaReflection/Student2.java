package JavaReflection;

public class Student2 {
    private String name;
    private int age;

    public Student2(){}
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println("学生在学习");
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
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
