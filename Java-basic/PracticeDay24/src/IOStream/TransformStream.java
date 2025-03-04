package IOStream;

import java.io.*;
import java.nio.charset.Charset;

public class TransformStream {
    //转换流是字符流和字节流之间的桥梁:InputStreamReader OutputStreamWriter
    //作用:1.指定字符集读写(已淘汰) 2.字节流想要使用字符流中的方法
    public static void main(String[] args) throws IOException {
        //利用转换流按照指定字符编码读取(了解)
        FileReader fr = new FileReader("PracticeDay24\\gbk.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();

        //利用转换流按照指定字符编码写出
        FileWriter fw = new FileWriter("PracticeDay24\\a.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();
    }
}
