package InterfaceAndAbstractClassTest;

public class PingPongPlayer extends Athlete implements English{
    public PingPongPlayer() {}
    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void job() {
        System.out.println("打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("学习说英文");
    }
}
