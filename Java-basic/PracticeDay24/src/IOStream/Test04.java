package IOStream;

import java.io.*;
import java.nio.charset.Charset;

public class Test04 {
    public static void main(String[] args) throws IOException {
        //将本地的GBK文件转为UTF-8文件
        //JDK11之前
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("PracticeDay24\\gbk.txt"), Charset.forName("GBK"));
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("PracticeDay24\\utf-8.txt"), Charset.forName("UTF-8"));
        //int b;
        //while ((b = isr.read()) != -1) {
        //    osw.write(b);
        //}
        //osw.close();
        //isr.close();

        //JDK11之后
        FileReader fr1 = new FileReader("PracticeDay24\\gbk.txt", Charset.forName("GBK"));
        FileWriter fw1 = new  FileWriter("PracticeDay24\\utf-8.txt", Charset.forName("UTF-8"));
        int b;
        while ((b = fr1.read()) != -1) {
            fw1.write(b);
        }
        fw1.close();
        fr1.close();
    }
}
