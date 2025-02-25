package ComprehensiveTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test02 {
    /*
      需求:
      班级里有N个学生
      要求:
      70%概率随机到男生,30%概率随机到女生
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);
        Collections.shuffle(list);

        Random random = new Random();
        int index = random.nextInt(list.size());
        int num = list.get(index);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        Collections.addAll(girlList, "杜琦燕", "袁明媛", "李猜", "田蜜蜜");

        if (num == 1) {
            Collections.shuffle(boyList);
            System.out.println(boyList.get(0));
        }
        else {
            Collections.shuffle(girlList);
            System.out.println(girlList.get(0));
        }
    }
}
