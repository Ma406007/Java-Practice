package TextVersionOfTheFightingGame;

public class GameTest {
    public static void main(String[] args) {
        Game r1 = new Game("r1", 100, '男');
        Game r2 = new Game("r2", 100, '男');
        r1.show();
        r2.show();
        while(true) {
            r1.attack(r2);
            if(r2.getBlood() == 0) {
                System.out.println(r1.getName() + "赢了");
                break;
            }

            r2.attack(r1);
            if(r1.getBlood() == 0) {
                System.out.println(r2.getName() + "赢了");
                break;
            }
        }
    }
}
