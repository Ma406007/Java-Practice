package HuTool;

import cn.hutool.core.io.IoUtil;

import java.io.IOException;

public class HuTool {
    /*
      相关类:
        IoUtil 流操作工具类
        FileUtil 文件读写和操作的工具
        FileTypeUtil 文件类型判断工具
        WatchMonitor 目录,文件监听
        ClassPathResource 针对ClassPath中资源的访问封装
        FileReader 封装文件读取
        FileWriter 封装文件写入
    */
    public static void main(String[] args) throws IOException {
        /*
          FileUtil类:
            file:根据参数创建一个File对象
            touch:根据参数创建文件

            writeLines:把集合中的数据写出到文件中,覆盖模式
            appendLines:把集合中的数据写出到文件中,续写模式
            readLines:指定字符编码,把文件中的数据读到集合中
            readUft8Lines:按照UTF-8的形式把文件中的数据读到集合中

            copy:拷贝文件或者文件夹
        */
    }
}
