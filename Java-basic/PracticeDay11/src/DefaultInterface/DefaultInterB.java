package DefaultInterface;

public interface DefaultInterB {
    public default void show() {
        System.out.println("接口B中的默认方法show()");
    }
}
