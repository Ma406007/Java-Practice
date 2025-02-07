import java.util.Scanner;

public class arithmetic_operatorstest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int gewei = num % 10;
        num /= 10;

        int shiwei = num % 10;
        num /= 10;

        int baiwei = num % 10;
        num /= 10;

        System.out.println("个位是:" + gewei);
        System.out.println("十位是:" + shiwei);
        System.out.println("百位是:" + baiwei);
    }
}
