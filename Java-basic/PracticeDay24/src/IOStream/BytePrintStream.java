package IOStream;

import java.io.IOException;

//打印流:一般是指PrintStream和PrintWriter两个类
//特点:1.打印流只操作文件目的地,不操作数据源 2.特有的写出方法可以实现,数据原样写出(即写什么打印什么) 3.特有的写出方法,可以实现自动刷新,自动换行(打印一次数据=写出+换行+刷新)

public class BytePrintStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //构造方法
        //public PrintStream(OutputStream/File/String) 关联字节输出流/文件/文件路径
        //public PrintStream(String fileName, Charset charset) 指定字符编码
        //由于字节打印流没有buffer缓冲区,自动刷新可有可无
        //public PrintStream(OutputStream out, boolean autoFlush) 自动刷新
        //public PrintStream(OutputStream out, boolean autoFlush, String encoding) 指定字符编码且自动刷新

        //成员方法
        //public void write(int b) 将指定的字节写出
        //public void println(Xxx xx) 特有方法:打印任意数据,自动刷新,自动换行
        //public void print(Xxx xx) 特有方法:打印任意数据,不换行
        //public void printf(String format, Object... args) 特有方法:带有占位符的打印语句,不换行
    }
}
