package CommonAPI;

//Math是一个帮助我们用于进行数学计算的工具类
//私有化构造方法,所有的方法都是静态的

public class JavaMath {
    //public static int abs(int a) 获取参数绝对值
    //public static double ceil(double a) 向上取整
    //public static double floor(double a) 向下取整
    //public static int round(float a) 四舍五入
    //public static int max(int a, int b) 获取两个int值中的较大值
    //public static double pow(double a, double b) 返回a的b次幂
    //public static double radom() 返回值为double的随机值,范围[0.0, 1.0)

    public static void main(String[] args) {
        System.out.println(Math.abs(-88));

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(-12.34));

        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(-12.34));

        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.54));
        System.out.println(Math.round(-12.34));
        System.out.println(Math.round(-12.54));

        System.out.println(Math.max(20, 30));

        System.out.println(Math.min(20, 30));

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.sqrt(4));

        System.out.println(Math.cbrt(8));

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
