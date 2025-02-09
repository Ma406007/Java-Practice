import java.util.Scanner;

public class branchandlooptest03 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(num + "是一个质数");
        }
        else {
            System.out.println(num + "不是一个质数");
        }
    }
}
