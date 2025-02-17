package Polymorphism02;

public class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("狗 show()方法");
    }
}
