package Inheritance.Test05;

public class Manager extends Employee {
    private double bonus;

    public Manager() {}
    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工");
    }

    @Override
    public void eat() {
        System.out.println("吃米饭");
    }
}
