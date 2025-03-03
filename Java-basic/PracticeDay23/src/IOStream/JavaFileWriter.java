package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {
    public static void main(String[] args) throws IOException {
        //构造方法
        //细节:1.参数是字符串表示的路径或者File对象 2.如果文件不存在会创建一个新的文件,但要保证父级路径存在 3.如果文件已存在会清空文件,如果不想清空可以打开续写开关
        //public FileWriter(File file) 创建字符输出流关联本地文件
        //public FileWriter(String pathname) 创建字符输出流关联本地文件
        //public FileWriter(File file, boolean append) 创建字符输出流关联本地文件,续写
        //public FileWriter(String pathname, boolean append) 创建字符输出流关联本地文件,缩写

        //成员方法
        //细节:如果write方法的参数是整数,但实际上写到本地文件中的是整数在字符集上对应的字符
        //void write(int c) 写出一个字符
        //void write(String str) 写出一个字符串
        //void write(String str, int off, int len) 写出一个字符串的一部分
        //void write(char[] charBuffer) 写出一个字符数组
        //void write(char[] charBuffer, int off, int len) 写出一个字符数组的一部分

        FileWriter fw = new FileWriter("PracticeDay23\\a.txt");

        //fw.write(25105);
        fw.write("你好,Java");

        fw.close();
    }
}
