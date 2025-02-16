package Util;

public class ArrayUtil {
    //被static修饰的成员方法叫做静态方法,多用在测试类和工具类中,JavaBean类中很少使用,调用方式有类名调用(推荐)和对象名调用
    //静态方法只能访问静态变量和静态方法
    //非静态方法可以访问静态变量或静态方法,也可以访问非静态的成员变量和非静态的成员方法
    //静态方法中没有this关键字

    //类的分类:
    //1.JavaBean类:用来描述一类事物的类
    //2.测试类:用来检查其他类是否书写正确,是带有main方法的类,是程序的入口
    //3.工具类:不是用来描述一类事物而是帮我们做一些事情的类.类名要见名知意,私有化其构造方法防止外界创建他的对象,方法定义为静态方便调用

    private ArrayUtil() {}

    public static String printArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
            }
            else {
                sb.append(array[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
