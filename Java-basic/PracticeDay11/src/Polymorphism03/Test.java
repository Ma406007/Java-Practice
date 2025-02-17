package Polymorphism03;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();

        //编译看左边,运行看右边
        a.eat();

        //多态的弊端:不能调用子类的特有功能
        //当调用成员方法时,编译看左边,运行看右边
        //那么在编译的时候会先检查左边的父类中有没有这个方法,没有就会直接报错
        //a.kanjia();

        //解决方法:变回子类型(强转)
        //Dog d = (Dog)a;
        //d.kanjia();
        //但是不能随便转,首先要明确关系,如果转成其他类的类型就会报错
        //Cat c = (Cat) a;
        //c.catchMouse();

        //类之间转换类型的完整代码:
        //if (a instanceof Dog) {
        //    Dog d = (Dog)a;
        //    d.kanjia();
        //}
        //else if (a instanceof Cat) {
        //    Cat c = (Cat)a;
        //    c.catchMouse();
        //}
        //else {
        //    System.out.println("没有这种类型,无法转换");
        //}

        //JDK17新特性:
        //先判断a是不是Dog类型,如果是就直接强转为Dog类型,并且转换之后将其命名为d
        //如果不是则不强转,结果是False
        if (a instanceof Dog d) {
            d.kanjia();
        }
        else if (a instanceof Cat c) {
            c.catchMouse();
        }
        else {
            System.out.println("没有这种类型,无法转换");
        }
    }
}
