package IOStream;

import java.io.IOException;

public class CharacterBufferedStream {
    //原理:底层自带了长度为8192的缓冲区提高性能
    public static void main(String[] args) throws IOException {
        //构造方法
        //public BufferedReader(Reader r) 把基本流变成高级流
        //public BufferedWriter(Writer r) 把基本流变成高级流

        //字符缓冲输入流特有方法
        //public String readLine() 读取一行数据(一行一行读取,遇到回车换行就停止,并且不会把回车换行读取),如果没有数据可读了,会返回null
        //字符缓冲输出流特有方法
        //public void newLine() 跨平台的换行
    }
}
