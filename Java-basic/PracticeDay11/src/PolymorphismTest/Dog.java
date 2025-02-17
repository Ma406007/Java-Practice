package PolymorphismTest;

public class Dog extends Animal {
    public Dog() {}
    public Dog(int age, String color) {
        super(age, color);
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}
