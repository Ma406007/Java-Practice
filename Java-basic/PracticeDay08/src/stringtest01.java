import java.util.Scanner;

public class stringtest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder ans = new StringBuilder();
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0') {
                ans.append("");
            } else {
                ans.append(arr[c - '0']).append(" ");
            }
            System.out.println(ans);
        }
    }
}
