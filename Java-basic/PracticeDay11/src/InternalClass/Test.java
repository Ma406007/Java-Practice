package InternalClass;

public class Test {
    public static void main(String[] args) {
        //获取内部类的方式:
        //1.外部类编写方法,对外提供内部类对象(内部类设为私有时可用)
        //Car.Engine ce1 = new Car().getEngine();
        //2.直接创建
        //格式:外部类名.内部类名 对象名 = 外部类对象.内部类对象()
        //Car.Engine ce2 = new Car().new Engine();

        //创建静态内部类对象的格式:外部类名.内部类名 对象名 = new 外部类名.内部类名()
    }
}
