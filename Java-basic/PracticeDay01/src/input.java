// 1.导包
// 导包的动作必须出现在类定义的上边
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // 键盘录入
        // Java帮我们写好了一个类叫Scanner,这个类就可以接收键盘输入的数字

        // 2.创建对象
        // 表示我要开始使用Scanner这个类了
        Scanner sc = new Scanner(System.in);

        // 3.接收数据
        System.out.println("请输入数字:");
        int i = sc.nextInt();

        System.out.println(i);
    }
}
