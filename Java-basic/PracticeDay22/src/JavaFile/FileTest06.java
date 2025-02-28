package JavaFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileTest06 {
    /*
      需求:统计一个文件夹中每个文件的个数并打印(考虑子文件夹)
      打印格式如下:
      txt:3个
      doc:4个
      jpg:6个
    */
    public static void main(String[] args) {
        File file = new File("E:\\JavaCode\\TempFile");
        getCount(file);
    }

    public static HashMap<String, Integer> fileCount = new HashMap<>();

    public static void getCount(File src) {

        File[] files = src.listFiles();
        for (File file : files) {
            //如果是文件就统计
            if (file.isFile()) {
                String[] arr = file.getName().split("\\.");
                if (arr.length > 2) {
                    String endName = arr[arr.length - 1];
                    if (fileCount.containsKey(endName)) {
                        int count = fileCount.get(endName);
                        fileCount.put(endName, ++count);
                    }
                    else {
                        fileCount.put(endName, 1);
                    }
                }
            }
            //文件夹
            else {
                getCount(file);
            }
        }
    }

}
