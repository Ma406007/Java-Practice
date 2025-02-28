package JavaFile;

import java.io.File;

public class FileTest02 {
    //需求:定义一个方法找某一个文件夹中是否有以.avi结尾的电影(暂时不需要考虑子文件夹)
    public static void main(String[] args) {
        File file1 =  new File("E:\\JavaCode\\TempFile");
        File[] files = file1.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".avi")) {
                System.out.println(f);
            }
        }
    }
}
