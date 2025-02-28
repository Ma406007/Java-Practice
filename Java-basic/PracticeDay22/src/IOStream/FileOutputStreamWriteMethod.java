package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamWriteMethod {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("PracticeDay22\\a.txt");
        byte[] bytes = {97, 98, 99, 100, 101};

        //FileOutputStream写数据的3种方式
        //void write(int b) 一次写一个字节数据
        //fos.write(97);
        //fos.write(98);

        //void write(byte[] b) 一次写一个字节数组数据
        //fos.write(bytes);

        //void write(byte[] b, int off, int len) 一次写一个字节数组的部分数据,off:起始索引,len:要写入的长度
        fos.write(bytes, 1, 2);

        fos.close();
    }
}
