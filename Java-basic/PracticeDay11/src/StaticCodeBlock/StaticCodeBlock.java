package StaticCodeBlock;

public class StaticCodeBlock {
    //Java中代码块分为三类:局部代码块,构造代码块,静态代码块
    //其中静态代码块最为重要

    //格式:static {}
    //特点:需要通过static关键字进行修饰,随着类的加载而加载,自动触发并且只执行一次
    //使用场景:在类加载的时候做一些数据初始化的时候使用
    static {
        System.out.println("静态代码块");
    }
}
