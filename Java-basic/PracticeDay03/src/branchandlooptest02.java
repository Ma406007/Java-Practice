import java.util.Scanner;

public class branchandlooptest02 {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i * i == x) {
                System.out.println(i);
                break;
            }
            else if (i * i > x) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
