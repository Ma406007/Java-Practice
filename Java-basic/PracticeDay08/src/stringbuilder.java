import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        //StringBuilder可以看成一个容器,创建之后里面的内容是可变的
        //作用是提高字符串的操作效率

        //构造方法分为有参和无参
        //public StringBuilder() 创建一个空白可变的字符串对象,不含有任何内容
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        //public StringBuilder(String str) 根据字符串的内容,来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("java");

        //成员方法
        //public StringBuilder append(任意类型) 添加数据,并返回对象本身
        System.out.println(sb2.append(sb3));
        //public StringBuilder reverse() 反转容器中的内容
        System.out.println(sb2.reverse());
        //public int length() 返回字符串的长度
        System.out.println(sb2.length());
        //public String toString() 通过toString()就可以实现把StringBuilder转换为String

        //链式编程
        //在调用一个方法时,不需要用变量接收其结果,并可以继续调用其他方法,直到无法调用为止
        int len = getString().substring(1).replace("a", "b").length();
        System.out.println(len);
    }

    public static String getString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
