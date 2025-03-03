package IOStream;

import java.io.*;

//缓冲流分为四种:字节缓冲输入流,字节缓冲输出流,字符缓冲输入流和字符缓冲输出流

public class ByteBufferedStream {
    //原理:底层自带了长度为8192的缓冲区以提高性能
    public static void main(String[] args) throws IOException {
        //构造方法
        //细节:同样可以一次拷贝多个字节
        //public BufferedInputStream(InputStream is) 把基本流包装成高级流,提高读取数据的性能
        //public BufferedOutputStream(OutputStream os) 把基本流包装成高级流,提高写出数据的性能
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("PracticeDay23\\d.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("PracticeDay23\\d_sorted.txt"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bos.close();
        bis.close();
    }
}
