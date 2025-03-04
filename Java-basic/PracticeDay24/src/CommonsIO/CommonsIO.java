package CommonsIO;

import java.io.IOException;

public class CommonsIO {
    //Commons-io是apache开源基金组织提供的一组有关IO操作的开源工具包,作用是提高IO流的开发效率

    //Commons-io使用步骤:
    //1.在项目中创建一个文件夹:lib
    //2.将jar包(第三方写好的各种类和方法后压缩成一个压缩包,在Java中压缩包的后缀为.jar)复制粘贴到lib文件夹
    //3.右键点击jar包,选择Add as Library -> 点击OK
    //4.在类中导包使用

    public static void main(String[] args) throws IOException {
        //Commons-io常见方法
        //FileUtils类(文件/文件夹相关)
        //static void copyFile(File srcFile, File destFile) 复制文件
        //static void copyDirectory(File srcDir, File destDir) 复制文件夹
        //static void copyDirectoryToDirectory(File srcDir, File destDir) 复制文件夹
        //static void deleteDirectory(File directory) 删除文件夹
        //static void cleanDirectory(File directory) 清空文件夹
        //static String readFileToString(File file, Charset encoding) 读取文件中的数据变成字符串
        //static void write(File file, CharSequence data, String encoding) 写出数据

        //IOUtils类(流相关)
        //public static int copy(InputStream input, OutputStream output) 复制文件
        //public static int copyLarge(Reader input, Writer output) 复制大文件
        //public static String readLines(Reader input) 读取数据
        //public static void write(String data, OutputStream output) 写出数据
    }
}
