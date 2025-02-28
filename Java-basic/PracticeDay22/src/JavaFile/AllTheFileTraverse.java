package JavaFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class AllTheFileTraverse {
    public static void main(String[] args) {
        //File的常见成员方法(获取并遍历)
        //public static File[] listRoots() 列出可用的文件系统根(盘符)
        File[] files1 = File.listRoots();
        System.out.println(Arrays.toString(files1));

        //public String[] list() 获取当前该路径下所有内容
        File file1 = new File("E:\\JavaCode\\TempFile");
        String[] files2 =  file1.list();
        for (String s : files2) {
            System.out.print(s + " ");
        }
        System.out.println();

        //public String[] list(FilenameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        //需求:获得E:\JavaCode\TempFile中所有的.txt文件
        File file2 = new File("E:\\JavaCode\\TempFile");
        String[] files3 = file2.list(new FilenameFilter() {
            @Override
            //accept方法的形参,依次表示TempFile文件夹里面每一个文件或者文件夹的路径
            //dir:父级路径
            //name:子级路径
            //返回值:如果返回true,表示当前路径全部保留;返回false,表示当前路径全部舍弃
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files3));

        //public File[] listFiles() 获取当前该路径下所有内容
        //需求:获得E:\JavaCode\TempFile中的所有.txt文件
        File file3 = new File("E:\\JavaCode\\TempFile");
        File[] files4 = file3.listFiles();
        for (File f : files4) {
            if (f.isFile() && f.getName().endsWith(".txt")) {
                System.out.print(f.toString() + " ");
            }
        }
        System.out.println();

        //public File[] listFiles(FileFilter filter) 利用文件名过滤器获取当前该路径下所有内容
        //public File[] listFiles(FilenameFilter filter) 利用文件名过滤器获取当前该路径下所有内容
    }
}
