package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsWildCardTest {
    /*
      需求:
        定义一个继承结构:动物,猫,波斯猫,狸花猫,狗,泰迪,哈士奇
        属性:名字,年龄
        行为:吃东西
        方法体打印:一只叫做XXX的,X岁的波斯猫,正在吃小饼干
                 一只叫做XXX的,X岁的狸花猫,正在吃鱼
                 一只叫做XXX的,X岁的泰迪,正在吃骨头,边吃边蹭
                 一只叫做XXX的,X岁的哈士奇,正在吃骨头,边吃边拆家
        测试类中定义一个方法用于饲养动物
          public static void keepPet(ArrayList<???> list) {
              //遍历集合,调用动物的eat()方法
          }
        要求1:该方法能养所有品种的猫,但是不能养狗 ? extends Cat
        要求2:该方法能养所有品种的狗,但是不能养猫 ? extends Dog
        要求3:该方法能养所有的动物,但是不能传递其他类型 ? extends Animal
    */

    public static void main(String[] args) {

    }

    //需求1
    public static void keepPet1(ArrayList<? extends Cat> arraylist) {
        for (int i = 0; i < arraylist.size(); i++) {
            arraylist.get(i).eat();
        }
    }

    //需求2
    public static void keepPet2(ArrayList<? extends Dog> arraylist) {
        for (Dog dog : arraylist) {
            dog.eat();
        }
    }

    //需求3
    public static void keepPet3(ArrayList<? extends Animal> arraylist) {
        Iterator iterator = arraylist.iterator();

        while (iterator.hasNext()) {
            Animal animal = (Dog) iterator.next();
            animal.eat();
        }
    }
}

abstract class Animal {
    private String name;
    private int age;

    public Animal() {}
    public Animal(String name, int age) {
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

    public void eat() {
        System.out.println("吃东西");
    }
}

abstract class Cat extends Animal {
    public Cat() {}
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃东西");
    }
}

class BoSiMao extends Cat {
    public BoSiMao() {}
    public BoSiMao(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的," + this.getAge() + "岁的波斯猫,正在吃小饼干");
    }
}

class LiHuaMao extends Cat {
    public LiHuaMao() {}
    public LiHuaMao(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的," + this.getAge() + "岁的狸花猫,正在吃鱼");
    }
}

abstract class Dog extends Animal {
    public Dog() {}
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃东西");
    }
}

class TaiDi extends Dog {
    public TaiDi() {}
    public TaiDi(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" +  this.getName() + "的," + this.getAge() + "岁的泰迪,正在吃骨头,边吃边蹭");
    }
}

class HaShiQi extends Dog {
    public HaShiQi() {}
    public HaShiQi(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" +  this.getName() + "的," + this.getAge() + "岁的哈士奇,正在吃骨头,边吃边拆家");
    }
}