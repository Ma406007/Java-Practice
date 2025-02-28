package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream {
    //IO流体系分为两种:
    //字节流:InputStream(字节输入流),OutputStream(字节输出流)
    //字符流:Reader(字符输入流),Writer(字符输出流)
    //以上均为抽象类
    public static void main(String[] args) throws IOException {
        /*
          需求:写出一段数据到本地文件中
          步骤:
          1.创建对象
            (1)FileOutputStream有参构造的参数是字符串表示的路径或者File对象都是可以的
            (2)如果文件不存在会创建一个新的文件,但是要保证父级路径是存在的
            (3)如果文件已经存在,会清空文件
          2.写出数据
            write()方法的参数是整数,实际上写到本地文件中的是整数在ASCII码上对应的内容
          3.释放资源
            每次创建流使用流如果不关闭Java会一直占用该文件,不能对其进行任何操作,所以每次使用完流轴都要释放资源
        */
        FileOutputStream fos = new FileOutputStream("PracticeDay22\\a.txt");
        fos.write(97);
        fos.close();
    }
}
