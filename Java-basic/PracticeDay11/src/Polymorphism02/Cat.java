package Polymorphism02;

public class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("猫 show()方法");
    }
}
