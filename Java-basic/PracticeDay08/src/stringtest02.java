import java.util.Scanner;

public class stringtest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int count = 0;
        while (count != A.length()) {
            if (A.equals(B)) {
                System.out.println("True");
                return;
            }
            A = reverse(A);
            count++;
        }
        System.out.println("False");
    }

    public static String reverse(String str) {
        char first = str.charAt(0);
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            res.append(str.charAt(i));
        }
        res.append(first);
        str = res.toString();
        return str;
    }
}
