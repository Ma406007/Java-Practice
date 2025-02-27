package JavaException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo01 {
    public static void main(String[] args) throws ParseException {
        //编译时异常(在编译阶段,必须手动处理,否则代码报错) Java文件通过Javac命令编译为字节码文件时出现
        //String time = "2030年1月1日";
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //Date date = sdf.parse(time);
        //System.out.println(date);

        //运行时异常(在编译阶段不需要处理,是代码运行时出现的异常) 字节码文件通过Java命令生成可执行程序得到运行结果时出现
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
    }
}
