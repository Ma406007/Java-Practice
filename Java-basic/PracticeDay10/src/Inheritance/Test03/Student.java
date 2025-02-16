package Inheritance.Test03;

public class Student extends Person {
    public void lunch() {
        //调用方法前会有隐藏的一个this,先在本类中查找eat和drink方法然后调用,如果没有就会向上查找继承下来的eat和drink方法
        eat();
        drink();

        //如果方法前有super则会跳过本类直接向上查找eat和drink方法
        super.eat();
        super.drink();
    }
}
