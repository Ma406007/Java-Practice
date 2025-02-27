package JavaException;

public class JavaExceptionMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            //异常中常见的成员方法(定义在Throwable中,三者均不会直接终止程序,若catch后面还有语句还会继续执行)
            //public String getMessage() 返回此throwable的详细消息字符串
            String message1 = e.getMessage();
            System.out.println(message1);//Index 10 out of bounds for length 6

            //public String toString() 返回此可抛出的简短描述
            String message2 = e.toString();
            System.out.println(message2);//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

            //public void printStackTrace() 底层利用System.err.println()进行输出,输出的语句是红色的,把异常的错误信息输出在控制台
            e.printStackTrace();//将JVM自动处理的结果打印在控制台(并不会终止程序)
        }

        System.out.println("检查执行语句");
    }
}
