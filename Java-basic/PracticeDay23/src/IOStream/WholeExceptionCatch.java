package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WholeExceptionCatch {
    public static void main(String[] args) throws FileNotFoundException {
        //基本做法:

        /*
          try {
              语句
          }
          catch {
              语句
          }
          finally {
              finally中的语句一定会被执行,除非虚拟机被停止
          }
        */

        //FileInputStream fis = null;
        //FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream("E:\\JavaCode\\TempFile\\movie.mp4");
//            fos = new FileOutputStream("PracticeDay23\\copy.mp4");
//
//            byte[] bytes = new byte[1024 * 1024 * 5];
//            int len;
//
//            while ((len = fis.read()) != -1) {
//                fos.write(bytes, 0, len);
//            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        //JDK7方案:

        /*
        只有实现了AutoCloseable接口的类才能在try中创建对象
          try (创建流对象1; 创建流对象2) {
              可能出现异常的代码
          }
          catch {
              异常的处理代码
          }
        try中创建的流对象最终都会被自动释放
        */

//        try (FileInputStream fis = new FileInputStream("E:\\JavaCode\\TempFile\\movie.mp4");
//        FileOutputStream fos = new FileOutputStream("PracticeDay23\\copy.mp4")) {
//            int len;
//            byte[] bytes = new byte[1024 * 1024 * 5];
//            while ((len = fis.read()) != -1) {
//                fos.write(bytes, 0, len);
//            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        //JDK9方案:

        /*
          创建流对象1;
          创建流对象2;
          try (流1; 流2) {
              可能出现异常的代码;
          }
          catch {
              异常的处理代码;
          }
        try中的流对象最终都会被自动释放
        */

        FileInputStream fis = new FileInputStream("E:\\JavaCode\\TempFile\\movie.mp4");
        FileOutputStream fos = new FileOutputStream("PracticeDay23\\copy.mp4");

        try (fis; fos) {
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read()) != -1) {
                fos.write(bytes, 0, len);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
