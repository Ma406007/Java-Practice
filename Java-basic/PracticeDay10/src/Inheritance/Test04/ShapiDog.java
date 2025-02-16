package Inheritance.Test04;

public class ShapiDog extends Dog {
    @Override
    public void eat() {
        System.out.println("吃狗粮");
        System.out.println("吃骨头");
    }
}
