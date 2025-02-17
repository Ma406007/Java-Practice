package Polymorphism02;

public class Test {
    public static void main(String[] args) {
        //创建对象(多态方式)
        //Fu f = new Zi();
        Animal a = new Dog();

        //调用成员变量:编译看左边,运行也看左边
        //编译看左边:Javac编译代码时会看左边的父类中有没有这个变量,如果有则编译成功,反之编译失败
        //运行也看左边:Java运行代码时实际获取的是左边父类中成员变量的值
        System.out.println(a.name);

        //调用成员方法:编译看左边,运行看右边
        //编译看左边:Javac编译代码时会看左边的父类中有没有这个方法,如果有则编译成功,反之编译失败
        //运行看右边:Java运行代码时实际上运行的是子类中的方法
        a.show();

        //理解:
        //Animal a = new Dog();
        //现在是用a去调用变量和方法,而a是Animal类型,所以默认都会先从Animal这个类中去找
        //成员变量:在子类对象中,会把父类成员变量也继承下来.父:name 子:name
        //成员方法:如果子类中对父类的成员方法进行了方法重写,那么在虚方法表中会将父类的方法进行覆盖
    }
}
