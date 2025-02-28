package JavaFile;

import java.io.File;

public class FileJudgeAndGet {
    public static void main(String[] args) {
        //File的常见成员方法(判断,获取)

        //public boolean isDirectory() 判断此路径名表示的File是否为文件夹
        //public boolean isFile() 判断此路径名表示的File是否为文件
        //public boolean exists() 判断此路径名表示的File是否存在
        File file1 = new File("E:\\JavaCode\\TempFile\\a.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println("--------------------------------");
        File file2 = new File("E:\\JavaCode\\TempFile\\bbb");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println("--------------------------------");
        File file3 = new File("E:\\JavaCode\\TempFile\\c.txt");
        System.out.println(file3.isDirectory());
        System.out.println(file3.isFile());
        System.out.println(file3.exists());
        System.out.println("--------------------------------");

        //public long length() 返回文件的大小(字节数量)
        //1.这个方法只能获取文件的大小,单位是字节,如果单位是KB,MB,GB等,需要不断除以1024
        //2.这个方法无法直接获取文件夹的大小,如果要获取一个文件夹的大小,需要把这个文件夹内部的所有文件大小累加
        File file4 = new File("E:\\JavaCode\\TempFile\\a.txt");
        long len = file4.length();
        System.out.println(len);
        File file5 = new File("E:\\JavaCode\\TempFile\\bbb");
        long len2 = file5.length();
        System.out.println(len2);
        System.out.println("--------------------------------");

        //public String getAbsolutePath() 返回文件的绝对路径
        File file6 = new File("E:\\JavaCode\\TempFile\\a.txt");
        String path = file6.getAbsolutePath();
        System.out.println(path);
        File file7 = new File("FileConstructor.java");//输入某个文件名默认从当前项目开始找
        String path2 = file7.getAbsolutePath();
        System.out.println(path2);
        System.out.println("--------------------------------");

        //public String getPath() 返回定义文件时使用的路径
        File file8 = new File("E:\\JavaCode\\TempFile\\a.txt");
        String path3 = file8.getPath();
        System.out.println(path3);
        File file9 = new File("FileConstructor.java");
        String path4 = file9.getPath();
        System.out.println(path4);
        System.out.println("--------------------------------");

        //public String getName() 返回文件的名称,带后缀
        //文件返回文件名+文件后缀
        //文件夹返回文件夹名
        File file10 = new File("E:\\JavaCode\\TempFile\\a.txt");
        String name = file10.getName();
        System.out.println(name);
        File file11 = new File("E:\\JavaCode\\TempFile\\bbb");
        String name2 = file11.getName();
        System.out.println(name2);
        System.out.println("--------------------------------");

        //public long lastModified() 返回文件的最后修改时间(毫秒值)
        File file12 = new File("E:\\JavaCode\\TempFile\\a.txt");
        long time = file12.lastModified();
        System.out.println(time);
    }
}
