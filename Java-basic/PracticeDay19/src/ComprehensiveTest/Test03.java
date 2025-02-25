package ComprehensiveTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Test03 {
    /*
      班级里有N个学生
      要求:
      被点到的学生不会再被点到,但是如果班级中所有的学生都点完了,需要重新开启第二轮点名
    */

    public static void main(String[] args) {
        HashSet<String> nameSet = new HashSet<>();

        ArrayList<String> List = new ArrayList<>();
        Collections.addAll(List, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        Collections.addAll(List, "杜琦燕", "袁明媛", "李猜", "田蜜蜜");

        Random random = new Random();
        while (nameSet.size() != List.size()) {
            int index = random.nextInt(List.size());
            if (nameSet.contains(List.get(index))) {
                continue;
            }
            System.out.println(List.get(index));
            nameSet.add(List.get(index));
        }
    }
}
