package Varargs;

public class Varargs {
    public static void main(String[] args) {
        //JDK5引入可变参数即方法形参的个数是可以发生变化的
        //格式:属性类型...名字
        //int...args

        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sum);

        //细节:
        //1.形参列表中可变参数只能有一个
        //2.可变参数必须放在形参列表的最后面
    }

    public static int getSum(int...args) {
        int sum = 0;
        //这里的args在底层实际上是一个变长数组
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
