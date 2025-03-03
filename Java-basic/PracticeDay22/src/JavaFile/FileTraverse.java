package JavaFile;

import java.io.File;

public class FileTraverse {
    public static void main(String[] args) {
        //File的常见方法(获取并遍历)
        //public File[] listFiles() 获取当前路径下的所有内容
        File file = new File("E:\\JavaCode\\TempFile");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }

        //注:
        //1.当调用者File表示的路径不存在时,返回null
        //2.当调用者File表示的路径是文件时,返回null
        //3.当调用者File表示的路径是一个空文件夹时,返回一个长度为0的数组
        //4.当调用者File表示的路径是一个有内容的文件夹时,会将里面所有文件和文件夹的路径放在File数组中进行返回
        //5.当调用者File表示的路径是一个有隐藏文件的文件夹时,会将里面所有文件和文件夹的路径放在File数组中进行返回,包含隐藏文件
        //6.当调用者File表示的路径是需要权限才能访问的文件夹时,返回null
    }
}
