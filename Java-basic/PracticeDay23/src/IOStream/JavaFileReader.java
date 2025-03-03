package IOStream;

import java.io.FileReader;
import java.io.IOException;

public class JavaFileReader {
    //字符流的底层其实就是字节流:字符流=字节流+字符集
    //特点:
    //输入流:一次读一个字节,遇到中文时,一次读多个字节
    //输出流:底层会把数据按照指定的编码方式进行编码,变成字节再写到文件中
    //使用场景:对于纯文本文件进行读写操作
    public static void main(String[] args) throws IOException {
        //操作本地文件的字符输入流
        //1.创建字符输入流对象
        //细节:如果文件不存在就会直接报错
        //public JavaFileReader(File file) 创建字符输入流关联本地文件
        //public JavaFileReader(String pathname) 创建字符输入流关联本地文件
        //JavaFileReader fr = new JavaFileReader("PracticeDay23\\a.txt");
        FileReader fr2 = new java.io.FileReader("PracticeDay23\\a.txt");

        //2.读取数据
        //细节:1.按字节进行读取,遇到中文,一次读多个字节,读取后解码,返回一个整数 2.读到文件末尾了,read()方法返回-1
        //public int read() 读取数据,读到末尾返回-1
        //public int read(char[] buffer) 读取多个数据,读到末尾返回-1
        //int ch;
        //while ((ch = fr.read()) != -1) {
        //    System.out.print((char)ch);
        //}

        char[] ch = new char[2];
        int len;
        //read(ch):读取数据,解码,强转三步合并,把强转后的字符放到数组当中
        //即空参的read + 强制类型转换
        while ((len = fr2.read(ch)) != -1) {
            System.out.println(new String(ch, 0, len));
        }

        //3.释放资源
        fr2.close();
    }
}
