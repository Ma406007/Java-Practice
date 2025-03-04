package IOStream;

import java.io.IOException;

public class CharacterPrintStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //构造方法
        //public PrintWriter(Write/File/String) 关联字节输出流/文件/文件路径
        //public PrintWriter(String fileName, Charset charset) 指定字符编码
        //由于字符流底层有缓冲区,如果想要自动刷新需要开启
        //public PrintWriter(Write w, boolean autoFlush) 自动刷新
        //public PrintWriter(OutputStream out, boolean autoFlush, Charset charset) 指定字符编码且自动刷新

        //成员方法
        //public void write(...) 写出字节或者字符串
        //public void println(Xxx xx) 特有方法:打印任意类型的数据并且换行
        //public void print(Xxx xx) 特有方法:打印任意类型的数据,不换行
        //public void printf(String format, Object... args) 特有方法:带有占位符的打印语句
    }
}
