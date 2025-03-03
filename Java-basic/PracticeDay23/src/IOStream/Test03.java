package IOStream;

import java.io.*;
import java.util.*;

public class Test03 {
    /*
      修改文件中的数据:
        文本文件中有以下数据:
          2-1-9-4-7-8
        将文件中的数据进行排序,变成以下数据:
          1-2-4-7-8-9
    */

    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("PracticeDay23\\c.txt");
//        StringBuilder sb = new StringBuilder();
//
//        int len;
//        while ((len = fr.read()) != -1) {
//            sb.append((char)len);
//        }
//
//        String str = sb.toString();
//        TreeSet<String> treeSet = new TreeSet<>();
//
//        //利用TreeSet底层的自动排序
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != '-') {
//                treeSet.add(str.substring(i, i + 1));
//            }
//        }
//
//        FileWriter fw = new FileWriter("PracticeDay23\\c_sorted.txt");
//        for (String s : treeSet) {
//            if (s.equals(treeSet.last())) {
//                fw.write(s);
//            }
//            else {
//                fw.write(s);
//                fw.write("-");
//            }
//        }
//
//        fw.close();
//        fr.close();

        FileReader fr = new FileReader("PracticeDay23\\c.txt");
        StringBuilder sb = new StringBuilder();

        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char)ch);
        }
        fr.close();

        Integer[] arr = Arrays.stream(sb.toString()
                .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        FileWriter fw = new FileWriter("PracticeDay23\\c_sorted.txt");
        String s = Arrays.toString(arr).replace(", ", "-");
        String result = s.substring(1, s.length() - 1);

        fw.write(result);
        fw.close();
    }
}
