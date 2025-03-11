package JavaReflection;

public class Teacher2 {
    private String name;
    private double salary;

    public Teacher2() {
    }

    public Teacher2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void teach() {
        System.out.println("老师在教书");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher2{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
