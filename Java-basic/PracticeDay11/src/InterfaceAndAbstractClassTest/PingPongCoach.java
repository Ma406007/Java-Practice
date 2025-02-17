package InterfaceAndAbstractClassTest;

public class PingPongCoach extends Coach implements English {
    public PingPongCoach() {}
    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void job() {
        System.out.println("训练乒乓球运动员");
    }

    @Override
    public void speakEnglish() {
        System.out.println("学习说英语");
    }
}
