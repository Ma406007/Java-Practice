package IOStream;

import java.io.*;
import java.util.*;

public class Test02 {
    /*
      修改文本顺序
      需求:把出师表的文章顺序进行恢复到一个新文件中
    */

    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("PracticeDay24\\csb.txt");
//        StringBuilder sb = new StringBuilder();
//
//        int b1;
//        int count = 1;
//        while ((b1 = fr.read()) != -1) {
//            sb.append((char)b1);
//            //统计行数
//            if ((char)b1 == '\n') {
//                count++;
//            }
//        }
//
//        HashMap<String, String> hashMap = new HashMap<>();
//        String[] str = new String[count];
//        String[] num = new String[count];
//
//        for (int i = 0; i < count; i++) {
//            int len = sb.toString().split("\n")[i].length();
//
//            //值str
//            str[i] = sb.toString().split("\n")[i].substring(2, len);
//            //键num
//            num[i] = String.valueOf(sb.toString().split("\n")[i].charAt(0));
//
//            hashMap.put(num[i], str[i]);
//        }
//
//        //将键num进行排序
//        List<String> list = new ArrayList<>();
//        Collections.addAll(list, num);
//        Collections.sort(list);
//
//        //写出排序后的结果
//        FileWriter fw = new FileWriter("PracticeDay24\\csb_sort.txt");
//        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//
//            fw.write(key + "." + value);
//
//            System.out.println(key + "." + value);
//        }
//
//        fw.close();
//        fr.close();

        BufferedReader br = new BufferedReader(new FileReader("PracticeDay24\\csb.txt"));
        String line;
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            treeMap.put(Integer.parseInt(arr[0]), arr[1]);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("PracticeDay24\\csb_sort.txt"));
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getKey() + "." + entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
