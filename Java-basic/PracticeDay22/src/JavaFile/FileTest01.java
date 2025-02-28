package JavaFile;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    //需求:在Temp文件夹中的aaa文件夹中创建一个a.txt文件
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\JavaCode\\TempFile\\aaa\\a.txt");
        boolean b1 = file1.createNewFile();
        System.out.println(b1);
    }
}
