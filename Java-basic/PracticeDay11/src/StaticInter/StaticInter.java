package StaticInter;

//JDK8后允许在接口中定义静态方法,需要用static修饰
//接口中静态方法的定义格式:public static 返回值类型 方法名(参数列表) {}

//注意事项:
//1.静态方法只能通过接口名调用:接口名.静态方法,不能通过实现类名或者对象名调用
//2.public可以省略,static不可以省略
//3.静态方法不可被重写

public interface StaticInter {
    public abstract void method();

    public static void show() {
        System.out.println("接口中的静态方法");
    }
}
