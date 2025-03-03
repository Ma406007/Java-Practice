package IOStream;

import java.io.*;

public class Test01 {
    /*
      需求:
      拷贝一个文件夹,考虑子文件夹
    */

    public static void main(String[] args) throws IOException {
        File src = new File("E:\\JavaCode\\TempFile");
        File dest = new File("E:\\JavaCode\\TempFileCopy");
        copyFile(src, dest);
    }

    public static void copyFile(File src, File dest) throws IOException {
        dest.mkdirs();

        File[] files = src.listFiles();

        if (files != null) {
            for (File file : files) {
                //f是文件夹
                if (file.isDirectory()) {
                    copyFile(file, dest);
                }
                //f是文件
                else {
                    FileInputStream fis = new FileInputStream(file);
                    FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                    byte[] buf = new byte[1024];
                    int len;

                    while ((len = fis.read(buf)) != -1) {
                        fos.write(buf, 0, len);
                    }

                    fos.close();
                    fis.close();
                }
            }
        }
    }
}
