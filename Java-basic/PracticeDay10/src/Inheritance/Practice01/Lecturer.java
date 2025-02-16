package Inheritance.Practice01;

public class Lecturer extends Teacher {
    public Lecturer() {}
    public Lecturer(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void method() {
        System.out.println("授课");
    }
}
