package InterfaceAndAbstractClassTest;

public class Coach extends Person {
    public Coach() {}
    public Coach(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void job() {
        System.out.println("训练");
    }
}
