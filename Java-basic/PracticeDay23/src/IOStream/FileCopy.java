package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    /*
      练习:
      文件拷贝
      将E:\JavaCode\TempFile\movie.mp4拷贝到当前模块下
    */
    public static void main(String[] args) throws IOException {
        //1.创建对象
        //FileInputStream fis = new FileInputStream("E:\\JavaCode\\TempFile\\movie.mp4");
        //FileOutputStream fos = new FileOutputStream("PracticeDay23\\copy.mp4");
        //2.拷贝
        //核心思想:边读边写
        //int b;
        //while ((b = fis.read()) != -1) {
        //    fos.write(b);
        //}
        //先开的最后关闭
        //fos.close();
        //fis.close();


        //改进:
        FileInputStream fis = new FileInputStream("E:\\JavaCode\\TempFile\\movie.mp4");
        FileOutputStream fos = new FileOutputStream("PracticeDay23\\copy.mp4");
        byte[] bytes = new byte[1024 * 1024 * 5];

        int len;
        while ((len = fis.read()) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();
    }
}
