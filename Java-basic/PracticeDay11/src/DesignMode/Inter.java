package DesignMode;

//设计模式是一套被反复使用,多数人知晓的,经过分类编目的,代码设计经验的总结,是为了可重用代码,让代码更容易被他人理解,保证代码可靠性,程序的重用性
//简单理解:设计模式就是各种套路
//适配器设计模式可以解决接口与接口实现类之间的矛盾问题,当一个接口中抽象方法过多并且只需要使用其中一部分时就可以使用适配器设计模式

//步骤:
//1.编写中间类(接口名)Adapter来实现对应的接口
//2.对接口中的抽象方法进行空实现
//3.为真正的实现类继承中间类,并重写需要用的方法
//4.为了避免其他类创建适配器类的对象,中间的适配器类需要用abstract进行修饰

public interface Inter {
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
    public abstract void method4();
    public abstract void method5();
    public abstract void method6();
    public abstract void method7();
    public abstract void method8();
    public abstract void method9();
    public abstract void method10();
}
