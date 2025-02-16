package Inheritance.Test05;

//父类中的构造方法不会被子类继承
//子类中所有的构造方法默认先访问父类中的无参构造,再执行自己
//为什么?:
//子类在初始化的时候有可能会用到父类中的数据,如果父类没有完成初始化,子类将无法使用父类的数据
//子类初始化之前一定要调用父类构造方法先完成父类数据空间的初始化

//子类构造方法的第一行语句默认都是:super(),不写也会存在且必须在第一行
//如果想调用父类的有参构造,必须手动写super进行调用

public class Person {
    String name;
    int age;
    String school;

    public Person() {
        this(null, 0, "传智大学");
        System.out.println("父类的无参构造");
    }
    public Person(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
