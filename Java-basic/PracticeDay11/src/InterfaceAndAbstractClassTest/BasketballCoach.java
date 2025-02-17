package InterfaceAndAbstractClassTest;

public class BasketballCoach extends Coach {
    public BasketballCoach() {}
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void job() {
        System.out.println("训练篮球运动员");
    }
}
