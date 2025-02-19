package CommonAPI;

//BigDecimal可以用于小数的精确运算,也可以用来表示很大的小数

import java.math.BigDecimal;

public class JavaBigDecimal {
    //构造方法
    //public BigDecimal(double val) 该构造方法由于double的失精问题不建议使用
    //public BigDecimal(String val) 建议使用
    //public static BigDecimal valueOf(double val) 没有超过double范围建议优先使用静态构造

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal(0.01);
        BigDecimal bigDecimal2 = new BigDecimal(0.09);

        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);

        BigDecimal bigDecimal3 = new BigDecimal("0.01");
        BigDecimal bigDecimal4 = new BigDecimal("0.09");

        System.out.println(bigDecimal3);
        System.out.println(bigDecimal4);
        System.out.println(bigDecimal3.add(bigDecimal4));

        //如果传递的是0 ~ 10之间的整数,那么静态方法实现复用,不会创建新对象
        BigDecimal bigDecimal5 = BigDecimal.valueOf(10);
        BigDecimal bigDecimal6 = BigDecimal.valueOf(10);
        BigDecimal bigDecimal7 = BigDecimal.valueOf(11);
        BigDecimal bigDecimal8 = BigDecimal.valueOf(11);
        System.out.println(bigDecimal5 == bigDecimal6);
        System.out.println(bigDecimal7 == bigDecimal8);
    }

    //成员方法
    //public static BigDecimal valueOf(double val) 获取对象
    //public BigDecimal add(BigDecimal val) 加法
    //public BigDecimal subtract(BigDecimal val) 减法
    //public BigDecimal multiply(BigDecimal val) 乘法
    //public BigDecimal divide(BigDecimal val) 除法
    //public BigDecimal divide(BigDecimal val, 精确几位, 舍入模式) 除法
}
