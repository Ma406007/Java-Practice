package AbstractClassAndAbstractObject;

//抽象方法:将共性的行为(方法)抽取到父类之后,由于每个子类执行的内容是不一样的,所以在父类中不能确定具体的方法体,该方法就可以定义为抽象方法
//定义格式:public abstract 返回值类型 方法名(参数列表);

//抽象类:如果一个类中存在抽象方法,该类就必须声明为抽象类
//定义格式:public abstract class 类名 {}

public abstract class Person {
    private String name;
    private int age;

    //作用:创建子类对象时继承给子类进行属性赋值
    public Person() { }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //抽象类和抽象方法的注意事项:
    //1.抽象类不能实例化(创建对象)
    //2.抽象类中不一定有抽象方法,有抽象方法的类一定是抽象类
    //3.可以有构造方法
    //4.抽象类的子类要么重写抽象类中的所有抽象方法(首选),要么是抽象类
    public abstract void work();

    public void sleep() {
        System.out.println("睡觉");
    }
}
