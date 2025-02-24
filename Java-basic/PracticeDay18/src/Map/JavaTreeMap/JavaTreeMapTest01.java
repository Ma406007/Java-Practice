package Map.JavaTreeMap;

import java.util.Set;
import java.util.TreeMap;

public class JavaTreeMapTest01 {
    /*
      需求:
      统计字符串"aababcabcdabcde"中每个字符出现的次数,并按照以下格式输出
      输出结果:a(5)b(4)c(3)d(2)e(1)
    */
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        treeMap.put("a", 0);
        treeMap.put("b", 0);
        treeMap.put("c", 0);
        treeMap.put("d", 0);
        treeMap.put("e", 0);

        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(i, i + 1);
            if (treeMap.containsKey(temp)) {
                treeMap.put(temp, treeMap.get(temp) + 1);
            }
        }

        Set<String> keys = treeMap.keySet();
        for (String key : keys) {
            System.out.print(key + " " + "(" + treeMap.get(key) + ")" + " ");
        }
    }
}
