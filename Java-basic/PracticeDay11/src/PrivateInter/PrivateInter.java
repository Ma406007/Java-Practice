package PrivateInter;

//JDK9中又新增了接口中私有方法
//接口中私有方法的定义格式:
//1.私有默认方法:private 返回值类型 方法名(参数列表) {}
//2.私有静态方法:private static 返回值类型 方法名(参数列表) {}

public interface PrivateInter {
    public default void show1() {
        System.out.println("show1()方法开始执行了");
        show5();
    }

    public default void show2() {
        System.out.println("show2()方法开始执行了");
        show5();
    }

    public static void show3() {
        System.out.println("show3()方法开始执行了");
        show6();
    }

    public static void show4() {
        System.out.println("show4()方法开始执行了");
        show6();
    }

    //默认的私有方法,为默认方法服务
    private void show5() {
        System.out.println("记录程序在运行过程中的各种细节,这里有100行代码");
    }

    //静态的私有方法,为静态方法服务
    private static void show6() {
        System.out.println("记录程序在运行过程中的各种细节,这里有100行代码");
    }
}
