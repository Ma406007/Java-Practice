package JavaFile;

import java.io.File;

public class FileTest03 {
    //需求:找到电脑中所有以.avi为结尾的的电影(需要考虑子文件夹)
    public static void main(String[] args) {
        File[] files1 = File.listRoots();
        for (File file : files1) {
            Scan(file);
        }
    }

    public static void Scan(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                //file1是文件
                if (file1.isFile()) {
                    if (file1.getName().endsWith(".avi")) {
                        System.out.println(file1.getAbsolutePath());
                    }
                }
                else {
                    Scan(file1);
                }
            }
        }
    }
}
