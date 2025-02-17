package InterfaceAndAbstractClassTest;

public class BasketballPlayer extends Athlete {
    public BasketballPlayer() {}
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void job() {
        System.out.println("打篮球");
    }
}
