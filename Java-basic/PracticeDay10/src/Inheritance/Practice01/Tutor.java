package Inheritance.Practice01;

public class Tutor extends Teacher {
    public Tutor() {}
    public Tutor(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void method() {
        System.out.println("协助授课");
    }
}
