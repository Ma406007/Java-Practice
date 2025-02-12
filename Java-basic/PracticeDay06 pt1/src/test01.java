import java.util.Objects;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextInt();
        int month = sc.nextInt();
        String airplane = sc.next();

        if (month >= 5 && month <= 10) {
            if (Objects.equals(airplane, "头等舱")) {
                price *= 0.9;
            } else if (Objects.equals(airplane, "经济舱")) {
                price *= 0.85;
            }
        }
        if (month >= 11 || month <= 4) {
            if (Objects.equals(airplane, "头等舱")) {
                price *= 0.7;
            } else if (Objects.equals(airplane, "经济舱")) {
                price *= 0.65;
            }
        }
        System.out.printf("%.2f", price);
    }
}
