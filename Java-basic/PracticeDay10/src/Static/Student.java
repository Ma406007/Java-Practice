package Static;

public class Student {
    private String name;
    private int age;
    private String gender;
    private static String teacherName;

    public Student() {}
    public Student(String name, int age, String gender, String teacherName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        Student.teacherName = teacherName;
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
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void study() {
        System.out.println(name + "正在学习");
    }

    public void show() {
        System.out.println(name + ", " + age + ", " + gender + ", " + teacherName);
    }

    //static表示静态,是Java中的一个修饰符,可以修饰成员方法,成员变量
    //使用static的标准是:如果该成员变量的值是所有对象共享的,那么就可以被static修饰

    //被static修饰的成员变量叫做静态变量,可以被该类的所有对象共享,不属于对象而属于类,调用方式有类名调用(推荐)和对象名调用
    //静态变量是随着类的加载而加载的,优先于对象存在
}
