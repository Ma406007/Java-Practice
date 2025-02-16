package Inheritance.Practice01;

public class Buyer extends AdminStaff {
    public Buyer() {}
    public Buyer(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void method() {
        System.out.println("采购物品");
    }
}
