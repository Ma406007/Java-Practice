package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInPutStream {
    public static void main(String[] args) throws IOException {
        /*
          需求:读取本地文件中的数据(暂时不写中文)
          步骤:
          1.创建对象
            如果文件不存在,就直接报错
          2.读取数据
            (1)一次读一个字节,读出来的数据是ASCII码上对应的数字
            (2)读到文件末尾了,read方法返回-1
          3.释放资源
        */
        FileInputStream fis = new FileInputStream("PracticeDay22\\a.txt");

        int b1 = fis.read();
        int b2 = fis.read();
        int b3 = fis.read();
        int b4 = fis.read();
        int b5 = fis.read();
        int b6 = fis.read();

        System.out.println((char)b1);
        System.out.println((char)b2);
        System.out.println((char)b3);
        System.out.println((char)b4);
        System.out.println((char)b5);
        System.out.println((char)b6);

        fis.close();
    }
}
