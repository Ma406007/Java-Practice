package Inheritance.Test03;

public class OverseasStudent extends Person {
    public void lunch () {
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    //方法重写
    //当父类方法不能满足子类现在的需求时,需要进行方法重写
    //在继承体系中,子类出现了和父类中一模一样的方法声明就称该方法是重写的方法
    //如果发生了重写则会覆盖原来父类的方法
    //注意事项:
    //1.重写方法的名称,形参列表必须与父类中的一致
    //2.子类重写父类方法时,访问权限子类必须大于父类(private<空着不写<protected<public)
    //3.子类重写父类方法时,返回值类型子类必须小于等于父类
    //4.建议:重写的方法尽量和父类保持一致
    //5.只有被添加到虚方法表中的方法才能被重写

    //@Override重写注解
    //1.@Override是放在重写后的方法上,校验子类重写时语法是否正确
    //2.加上注解后如果有红色波浪线,表示语法错误
    //3.建议重写方法都加@Override注解,代码正确优雅
    @Override
    public void eat() {
        System.out.println("吃意大利面");
    }

    //方法重写
    @Override
    public void drink() {
        System.out.println("喝凉水");
    }
}
