package JavaFile;

import java.io.File;
import java.io.IOException;

public class FileCreateAndDelete {
    public static void main(String[] args) throws IOException {
        //File的常见成员方法(创建,删除)

        //public boolean createNewFile() 创建一个新的空的文件夹
        //1.如果当前路径表示的文件不存在,则创建成功,返回true;反之创建失败,返回false
        //2.如果父级路径不存在,方法会有异常IOException
        //3.createNewFile方法创建的一定是文件,如果路径中不包含后缀名,则会创建一个没有后缀的文件
        File file1 = new File("E:\\JavaCode\\TempFile\\c.txt");
        boolean b1 = file1.createNewFile();
        System.out.println(b1);

        //public boolean mkdir() 创建单级文件夹
        //1.Windows中路径是唯一的,如果当前路径已存在,则创建失败,返回false
        //2.mkdir()方法只能创建单级文件夹,无法创建多级文件夹
        File file2 = new File("E:\\JavaCode\\TempFile\\aaa\\aaa\\bbb\\ccc");
        boolean b2 = file2.mkdir();
        System.out.println(b2);

        //public boolean mkdirs() 创建多级文件夹
        //既可以创建单级文件夹,又可以创建多级文件夹
        File file3 = new File("E:\\JavaCode\\TempFile\\aaa\\aaa\\bbb\\ccc");
        boolean b3 = file3.mkdirs();
        System.out.println(b3);

        //public boolean delete() 删除文件,空文件夹(不走回收站,删除就没了)
        //如果删除的是文件,则直接删除,不走回收站
        //如果删除的是空文件夹,则直接删除,不走回收站
        //如果删除的是有内容的文件夹,则删除失败
        File file4 = new File("E:\\JavaCode\\TempFile\\aaa");
        boolean b4 = file4.delete();
        System.out.println(b4);
    }
}
