package InterfaceAndAbstractClassTest;

public class Athlete extends Person {
    public Athlete() {}
    public Athlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void job() {
        System.out.println("打球");
    }
}
