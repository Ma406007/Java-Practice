package IOStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipStream {
    //压缩包里面的每一个文件在Java中都是ZipEntry对象
    //解压的本质就是将每一个ZipEntry对象按照层级关系拷贝到另一个文件夹中
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //src为待解压的压缩包
        File src = new File("");
        //dest为解压的目的地
        File dest = new File("");

        unzip(src, dest);
    }

    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            //entry是文件夹,就需要在目的地dest处创建一个同样的文件夹
            if (entry.isDirectory()) {
                File file = new  File(dest, entry.toString());
                file.mkdirs();
            }
            //entry是文件,就需要读取到压缩包中的文件,并存放到目的地dest文件夹中(按照层级目录进行存放)
            else {
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                //表示在压缩包中的一个文件处理完毕了
                zip.closeEntry();
            }
        }

        zip.close();
    }
}
