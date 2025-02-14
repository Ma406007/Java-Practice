import java.util.Scanner;
import java.util.StringJoiner;

public class stringjoiner {
    public static void main(String[] args) {
        //StringJoiner和StringBuilder一样,也可以看成是一个容器,创建之后里面的内容是可变的
        //作用是提高字符串的操作效率,而且代码编写特别简洁,但目前市场上很少有人用(jdk8之后才出现)

        //构造方法
        //public StringJoiner(间隔符号) 创建一个StringJoiner对象,指定拼接时的间隔符号
        StringJoiner sj1 = new StringJoiner("---");
        //public StringJoiner(间隔符号,开始符号,结束符号) 创建一个StringJoiner对象,指定拼接时的间隔符号,开始符号,结束符号

        //成员方法
        //public StringJoiner add(添加的内容) 添加数据,并返回对象本身
        sj1.add("Hello").add("World").add("Java");
        //public int length() 返回长度(字符出现的个数)
        //public String toString() 返回一个字符串(也就是拼接之后的结果)

        System.out.println(sj1);
    }
}
