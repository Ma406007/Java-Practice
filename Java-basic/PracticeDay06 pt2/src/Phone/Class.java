package Phone;

public class Class {

    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "小米";
        p.price = 1999.0;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.game();

        //用来描述一类事物的类,专业叫做:Javabean类
        //在Javabean类中,是不写main方法的
        //在以前编写main方法的类,叫做测试类
        //我们可以在测试类中创建Javabean类的对象,并进行赋值调用

        //类名的首字母建议大写,需要见名知意,驼峰命名法
        //一个Java文件中可以定义多个class类,但是只能一个类是public修饰,而且public修饰的类名必须成为代码文件名
        //建议:一个Java文件中只定义一个class类
        //成员变量的完整定义格式是:
        //修饰符 数据类型 变量名称 = 初始化值;
        //一般无需指定修饰符,使用默认的即可
    }
}
