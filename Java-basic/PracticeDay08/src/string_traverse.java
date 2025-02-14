import java.util.Scanner;

public class string_traverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            //i依次表示字符串的每一个索引
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
