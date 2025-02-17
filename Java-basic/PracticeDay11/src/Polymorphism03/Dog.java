package Polymorphism03;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public void kanjia() {
        System.out.println("看家");
    }
}
