package Interface;

//接口是一种规则,用关键字interface来定义 public interface 接口名 {}
//接口不能实例化(创建对象)
//接口和类之间是实现关系,通过implements关键字表示 public class 类名 implements 接口名 {}
//接口的子类(实现类)要么重写接口中的所有抽象方法,要么是抽象类

//注意:
//1.接口和类的实现关系,可以单实现也可以多实现 public class 类名 implements 接口名1, 接口名2 {}
//2.实现类还可以在继承一个类的同时实现多个接口 public class 类名 extends 父类 implements 接口名1, 接口名2 {}

public interface Swim {
    public abstract void swim();
}

//接口中成员的特点:
//成员变量只能是常量,默认修饰符是public static final,即便不写也会自动添加
//没有构造方法
//成员方法只能是抽象方法,默认修饰符是public abstract,即便不写也会自动添加

//JDK7以前只能定义抽象方法
//JDK8新特性:接口中可以定义有方法体的方法
//JDK9新特性:接口中可以定义私有方法

//接口和类之间的关系:
//类和类之间的关系:继承关系,只能单继承,不能多继承,但可以多层继承
//类和接口之间的关系:实现关系,可以单实现,也可以多实现,还可以在继承一个类的同时实现多个接口(类实现各个接口时需要重写所有的抽象方法,如果不同接口中有重名的抽象方法则只需要重写一个)
//接口和接口之间的关系:继承关系,可以单继承,也可以多继承(类实现最下面的子接口时需要重写所有的抽象方法)