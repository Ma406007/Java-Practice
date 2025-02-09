import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int number = 1;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
//        switch (number) {
//            case 1:
//                System.out.println("一");
//                break;
//            case 2:
//                System.out.println("二");
//                break;
//            case 3:
//                System.out.println("三");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }
        switch (number) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("输入错误");}
        }
    }
}
