package Inheritance.Practice01;

public class Teacher extends Employee {
    public Teacher(){}
    public Teacher(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        System.out.println("老师教课");
    }

    public void method() {
        System.out.println("教学方法");
    }
}
