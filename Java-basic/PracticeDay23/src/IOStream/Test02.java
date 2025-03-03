package IOStream;

import java.io.*;

public class Test02 {
    /*
      为保证文件的安全性,就需要对原始文件进行加密存储,在使用的时候再对其进行解密处理
      加密原理:
        对原始文件中的每一个字节数据进行更改,然后将更改以后的数据存储到新的文件中
      解密原理:
        读取加密之后的文件,按照加密的规则反向操作,变成原始文件
    */

    public static void main(String[] args) throws IOException {
        //解密:将fis的路径改为加密文件的路径,再将fos改为要生成的新文件以此来解密获得原文件
        FileInputStream fis = new FileInputStream("PracticeDay23\\a.txt");
        FileOutputStream fos = new FileOutputStream("PracticeDay23\\b.txt");

        int b;
        while ((b = fis.read()) != -1) {
            //异或加密处理
            fos.write(b ^ 100);
        }

        fos.close();
        fis.close();
    }
}
