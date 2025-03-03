package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class BigFileCopy {
    public static void main(String[] args) throws IOException {
        //FileInputStream一次读多个字节
        //public int read() 一次读一个字节数据
        //public int read(byte[] buffer) 一次读一个字节数组数据
        //注意:一次读一个字节数组的数据,每次读取会尽可能把数组装满,数组的长度最好是1024的整数倍

        FileInputStream fis = new FileInputStream("E:\\JavaCode\\Java-Practice\\Java-basic\\PracticeDay23\\a.txt");
        byte[] bytes = new byte[2];
        //返回值:本次读取到了多少个字节数据
        int len1 = fis.read(bytes);
        System.out.println(len1);
        String str1 = new String(bytes, 0, len1);
        System.out.println(str1);

        int len2 = fis.read(bytes);
        System.out.println(len2);
        String str2 = new String(bytes, 0, len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);
        System.out.println(len3);
        String str3 = new String(bytes, 0, len3);
        System.out.println(str3);


    }
}
