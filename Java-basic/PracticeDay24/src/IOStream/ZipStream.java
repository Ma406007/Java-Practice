package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStream {
    //压缩本质:把每一个文件/文件夹看成ZipEntry对象放到一个压缩包中
    public static void  main(String[] args) throws IOException, ClassNotFoundException {
        /*
          需求:
            将E:\JavaCode\TempFile\a.txt打包成一个压缩包
        */

        File src = new File("E:\\JavaCode\\TempFile\\a.txt");
        File dest = new File("E:\\JavaCode\\TempFile");

        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        ZipEntry entry = new ZipEntry("a.txt");
        zos.putNextEntry(entry);

        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }

        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
