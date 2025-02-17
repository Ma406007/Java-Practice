package DefaultInterface;

public class Class implements DefaultInterA, DefaultInterB {
    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法");
    }

    @Override
    public void show() {
        System.out.println("重写接口中的默认方法");
    }
}
