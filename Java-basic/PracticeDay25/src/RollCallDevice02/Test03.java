package RollCallDevice02;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test03 {
    /*
      需求:
        一个文件里面存储了班级同学的信息,每一个学生信息占一行
        格式为:张三-男-23
        要求通过程序实现随机点名器
      运行效果:
        70%的概率随机到男生
        30%的概率随机到女生
        总共随机100万次,统计结果
        注意观察:看生成男生和女生的比例是不是接近于7:3
    */

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("PracticeDay25\\src\\RollCallDevice02\\names.txt");
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        ArrayList<Integer> List = new ArrayList<>();

        Collections.addAll(List, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(List, 0, 0, 0);
        Collections.shuffle(List);
        Collections.shuffle(List);

        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = fr.read()) != -1) {
            if (ch != '\n') {
                sb.append((char)ch);
            }
            else {
                //男生
                if (sb.toString().split("-")[1].equals("男")) {
                    boyList.add(sb.toString().split("-")[0] + " " + sb.toString().split("-")[1]);
                }
                //女生
                else {
                    girlList.add(sb.toString().split("-")[0] + " " + sb.toString().split("-")[1]);
                }
                sb.delete(0, sb.length());
            }
        }

        Collections.shuffle(boyList);
        Collections.shuffle(girlList);

        //抽男生
        if (List.get(0) == 1) {
            System.out.println(boyList.get(0));
        }
        //抽女生
        else if (List.get(0) == 0) {
            System.out.println(girlList.get(0));
        }

        fr.close();
    }
}
