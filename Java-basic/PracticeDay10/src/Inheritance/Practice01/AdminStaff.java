package Inheritance.Practice01;

public class AdminStaff extends Employee {
    public AdminStaff() {}
    public AdminStaff(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        System.out.println("负责公司业务");
    }

    public void method() {
        System.out.println("负责不同事项");
    }
}
