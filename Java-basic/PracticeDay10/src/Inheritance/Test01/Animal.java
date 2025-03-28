package Inheritance.Test01;

//Java中提供了一个关键字extends,用这个关键字,我们可以让一个类和另一个类建立起继承关系
//public class Student extends Person {}
//其中Student称为子类(派生类),Person称为父类(基类或超类),子类 extends 父类
//继承的好处:1.可以把多个子类中重复的代码抽取到父类,提高代码的复用性 2.子类可以在父类的基础上增加其他的功能从而使子类更强大
//当类与类之间存在相同(共性)的内容并满足子类是父类中的一种时就可以考虑使用继承来优化代码

//Java中只支持单继承,即一个子类只能继承一个父类,不支持多继承,即一个子类继承多个父类,但支持多层继承,即子类A继承父类B,父类B继承父类C,父类C为子类A的间接父类
//每一个类都直接或间接继承于Object,如果一个类没有继承另一个类,则虚拟机默认将此类继承于object

public class Animal {
    public void eat() {
        System.out.println("吃饭");
    }

    public void drink() {
        System.out.println("喝水");
    }

}

//子类可以继承父类的私有成员变量(只能通过get和set间接获取),非私有成员变量和非私有成员方法
//其中如果有多个类有多层继承关系,而子类需要一级一级往前调用某个非私有成员方法,这时除了该子类之前的所有类中的非private,非static,非final修饰的方法都会存到一个虚方法表中来方便子类调用方法
//子类不能继承构造方法和私有成员方法
