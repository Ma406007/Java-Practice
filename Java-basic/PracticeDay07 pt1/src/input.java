import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //键盘录入

        //遇到空格,回车,制表符就会停止接收
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n=sc.nextInt();
        System.out.println(n);
        //遇到回车才停止接收
        //nextLine();接收字符串
    }
}
