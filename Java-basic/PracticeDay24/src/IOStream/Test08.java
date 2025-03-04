package IOStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test08 {
    /*
      需求:
      将E:\JavaCode\TempFile压缩成一个压缩包
    */

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File src = new File("E:\\JavaCode\\TempFile");
        //创建File对象表示压缩包放在那里(压缩包的父级路径)
        File destParent = src.getParentFile();
        File dest = new File(destParent, src.getName() + ".zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        toZip(src, zos, src.getName());

        zos.close();
    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        //进入src文件夹
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            //file是文件
            if (file.isFile()) {
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);
                //读取文件中的数据,写到压缩包
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }
            //file是文件夹
            else {
                toZip(file, zos, name + "\\" + file.getName());
            }
        }
    }
}
