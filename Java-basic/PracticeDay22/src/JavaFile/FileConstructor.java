package JavaFile;

//File对象就表示一个路径,可以是文件的路径,也可以是文件夹的路径
//这个路径可以是存在的,也可以是不存在的

//路径分为绝对路径和相对路径
//绝对路径带盘符
//相对路径不带盘符,默认从当前项目下去找

import java.io.File;

public class FileConstructor {
    public static void main(String[] args) {
        //File常见构造方法
        //public File(String pathname) 根据文件路径创建文件对象
        String str = "E:\\JavaCode\\Java-Practice\\Java-basic\\PracticeDay22\\TempFile\\a.txt";
        File file1 = new File(str);
        System.out.println(file1);

        //public File(String parent, String child) 根据父路径名字符串和子路径名字符串创建文件对象
        //父级路径:E:\JavaCode\Java-Practice\Java-basic\PracticeDay22\TempFile
        //子级路径:a.txt
        String parent = "E:\\JavaCode\\Java-Practice\\Java-basic\\PracticeDay22\\TempFile";
        String child = "a.txt";
        File file2 = new File(parent, child);
        System.out.println(file2);

        //public File(File parent, String child) 根据父路径对应文件对象和子路径名字字符串创建文件对象
        File parent2 = new File("E:\\JavaCode\\Java-Practice\\Java-basic\\PracticeDay22\\TempFile");
        String child2 = "a.txt";
        File file3 = new File(parent2, child2);
        System.out.println(file3);
    }
}