package Inheritance.Test05;

public class Student extends Person {
    public Student() {
        super();//调用父类的无参构造
        System.out.println("子类的无参构造");
    }
    public Student(String name, int age, String school) {
        super(name, age, school);//调用父类的有参构造
    }

}
