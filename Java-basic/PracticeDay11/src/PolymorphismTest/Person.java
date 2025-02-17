package PolymorphismTest;

public class Person {
    private String name;
    private int age;

    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void keepPet(Animal animal, String food) {
        if (animal instanceof Dog dog) {
            System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
            System.out.println(dog.getAge() + "岁的" + dog.getColor() + "颜色的狗两只前腿死死的抱住" + food + "猛吃");
        }
        else if (animal instanceof Cat cat) {
            System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
            System.out.println(cat.getAge() + "岁的" + cat.getColor() + "颜色的猫眯着眼睛侧着头吃" + food);
        }
        else {
            System.out.println("没有这种类型");
        }
    }
}
