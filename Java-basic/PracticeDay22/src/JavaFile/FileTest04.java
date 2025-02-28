package JavaFile;

import java.io.File;

public class FileTest04 {
    //需求:删除一个多级文件夹
    public static void main(String[] args) {
        File file = new File("E:\\JavaCode\\TempFile\\aaa");
        Delete(file);
    }

    public static void Delete(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                //file1是文件
                if (file1.isFile()) {
                    file1.delete();
                }
                else {
                    Delete(file1);
                }
            }
        }
        file.delete();
    }
}
