package WrapperClass;

//包装类:用一个对象把基本数据类型包起来形成的类就叫包装类,即基本数据类型对应的对象

public class WrapperClass {
    public static void main(String[] args) {
        //获取Integer对象的方式(JDK5以前的方式,了解)
        //public Integer(int value) 根据传递的整数创建一个Integer对象
        //public Integer(String s) 根据传递的字符串创建一个Integer对象
        //public static Integer valueOf(int i) 根据传递的整数创建一个Integer对象
        //public static Integer valueOf(String s) 根据传递的字符串创建一个Integer对象
        //public static Integer valueOf(String s, int radix) 根据传递的字符串和进制创建一个Integer对象
        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf("2");
        Integer i3 = Integer.valueOf("123", 8);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        //JDK5以后int和Integer可以看作是一个东西,因为在内部可以自动转化
        //在底层,此时还会去自动调用静态方法valueOf得到一个Integer对象,只不过这个动作不需要我们自己去操作了
        //自动装箱
        Integer i4 = 10;

        Integer i5 = Integer.valueOf(10);
        //自动拆箱
        int i = i5;

        //Integer成员方法
        //public static String toBinaryString(int i) 得到二进制
        //public static String toOctalString(int i) 得到八进制
        //public static String toHexString(int i) 得到十六进制
        //public static int parseInt(String s) 将字符串类型的整数转成int类型的整数
    }
}
