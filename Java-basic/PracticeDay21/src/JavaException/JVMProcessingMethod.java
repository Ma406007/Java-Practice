package JavaException;

public class JVMProcessingMethod {
    public static void main(String[] args) {
        //JVM默认的处理方式
        //把异常的名称,异常原因以及异常出现的位置等信息输出在控制台,随后程序停止执行,下面代码不再执行
        System.out.println("aaa");
        System.out.println(1/0);
        System.out.println("bbb");
        System.out.println("ccc");
    }
}
