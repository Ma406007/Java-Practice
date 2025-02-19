package CommonAPI;

import java.math.BigInteger;
import java.util.Random;

public class JavaBigInteger {
    //构造方法(对象一旦创建,内部记录的值就不能发生改变,只要进行计算就会产生一个新的BigInteger对象)
    //public BigInteger(int num, Random rnd) 获取随机大整数,范围[0, pow(2, num) - 1]
    //public BigInteger(String val) 获取指定的大整数(val必须为整数,否则会报错)
    //public BigInteger(String val, int radix) 获取指定进制的大整数
    //public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象,内部有优化

    /*public static void main(String[] args) {
        Random rand = new Random();
        BigInteger bigInteger = new BigInteger(4, rand);
        System.out.println(bigInteger);

        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger1);

        BigInteger bigInteger2 = new BigInteger("100", 2);
        System.out.println(bigInteger2);

        //能表示的范围只有long类型的范围
        //对常用的数字进行了优化-16 ~ 16,如果多次创建相同数字的对象就不会创建新的(复用),超出-16 ~ 16这个范围就会创建新的
        BigInteger bigInteger3 = BigInteger.valueOf(16);
        BigInteger bigInteger4 = BigInteger.valueOf(16);
        BigInteger bigInteger5 = BigInteger.valueOf(17);
        BigInteger bigInteger6 = BigInteger.valueOf(17);
        System.out.println(bigInteger3 == bigInteger4);//比较地址值 true
        System.out.println(bigInteger5 == bigInteger6);//false

        //总结:如果数字没有超出long范围则用静态方法获取,如果超出了用构造方法获取,一旦创建,内部记录的值就不会发生改变
    }*/

    //成员方法
    //public BigInteger add(BigInteger val) 加法
    //public BigInteger subtract(BigInteger val) 减法
    //public BigInteger multiply(BigInteger val) 乘法
    //public BigInteger divide(BigInteger val) 除法(获取商)
    //public BigInteger[] divideAndRemainder(BigInteger val) 除法(获取商和余数)
    //public boolean equals(Object x) 比较是否相等
    //public BigInteger pow(int exponent) 次幂
    //public BigInteger max/min(BigInteger val) 返回较大值/较小值
    //public int intValue(BigInteger val) 转为int类型整数,超出范围数据有误

    public static void main(String[] args) {

    }
}
