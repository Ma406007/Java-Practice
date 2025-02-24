package Map.JavaHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Set;

public class JavaHashMapTest02 {
    /*
      需求:
      某个班级有80名学生,现在需要组成秋游活动,班长提供了四个景点依次是(A,B,C,D),每个学生只能选择一个景点,请统计出最终哪个景点想去的人数最多
    */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("B", 0);
        map.put("C", 0);
        map.put("D", 0);

        Set<String> keys = map.keySet();
        for (int i = 0; i < list.size(); i++) {
            for (String key : keys) {
                if (key.equals(list.get(i))) {
                    //put()方法覆盖
                    map.put(list.get(i), map.get(key) + 1);
                }
            }
        }

        int maxNum = 0;
        String goal = "";
        for (String key : keys) {
            if (map.get(key) > maxNum) {
                maxNum = map.get(key);
                goal = key;
            }
        }

        System.out.println(goal + ":" + maxNum);
    }
}
