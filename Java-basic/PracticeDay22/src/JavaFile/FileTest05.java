package JavaFile;

import java.io.File;

public class FileTest05 {
    //需求:统计一个文件夹的总大小
    public static void main(String[] args) {
        File file = new File("E:\\CCtalk");
        System.out.println(Total(file));
    }

    public static long sum = 0;

    public static long Total(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    sum += f.length();
                }
                else {
                    Total(f);
                }
            }
        }
        return sum;
    }
}
