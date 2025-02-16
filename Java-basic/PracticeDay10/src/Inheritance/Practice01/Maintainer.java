package Inheritance.Practice01;

public class Maintainer extends AdminStaff {
    public Maintainer() {}
    public Maintainer(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void method() {
        System.out.println("维护公司");
    }
}
