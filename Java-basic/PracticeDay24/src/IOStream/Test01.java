package IOStream;

import java.io.*;

public class Test01 {
    /*
      拷贝文件
      四种方式拷贝文件并统计各自用时
      字节流的基本流:一次读写一个字节
      字节流的基本流:一次读写一个字节数组
      字节缓冲流:一次读写一个字节
      字节缓冲流:一次读写一个字节数组
    */

    public static void main(String[] args) throws IOException {
        //这里需要引入一个比较大的文件才能看出明显区别
        File src = new File("PracticeDay23\\a.txt");
        File dest = new File("PracticeDay23\\a_copy.txt");

        long start = System.currentTimeMillis();
        //method1(src, dest);
        //method2(src, dest);
        //method3(src, dest);
        //method4(src, dest);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
    }

    public static void method1(File src, File dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fos.close();
        fis.close();
    }

    public static void method2(File src, File dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] buffer = new byte[8192];
        int b;
        while ((b = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, b);
        }

        fos.close();
        fis.close();
    }

    public static void method3(File src, File dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bos.close();
        bis.close();
    }

    public static void method4(File src, File dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        byte[] buffer = new byte[8192];
        int b;
        while ((b = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, b);
        }

        bos.close();
        bis.close();
    }
}
