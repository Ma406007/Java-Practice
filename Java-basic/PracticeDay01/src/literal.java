public class literal {
    public static void main(String[] args) {

        // 整数
        System.out.println(666);
        System.out.println(-777);

        // 浮点数
        System.out.println(1.93);
        System.out.println(-3.71);

        // 字符串
        System.out.println("黑马程序员");
        System.out.println("尼古拉斯凯奇");

        // 字符
        System.out.println('男');
        System.out.println('女');

        // 布尔
        System.out.println(true);
        System.out.println(false);

        // 空
        // 细节:null不能直接被打印
        // 如果要打印,只能用字符串的形式打印
        System.out.println("null");

        // 制表符'\t'(idea中需要设置)
        // 在打印的时候,把前面字符串的长度补齐到8,或者8的整数倍
        // 最少补1个空格,最多补8个空格
        System.out.println("name" + '\t' + "age");
        System.out.println("tom" + '\t' + "23");
    }
}