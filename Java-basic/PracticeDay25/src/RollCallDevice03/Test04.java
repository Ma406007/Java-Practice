package RollCallDevice03;

import javax.naming.Name;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test04 {
    /*
      需求:
        一个文件里面存储了班级同学的姓名,每一个姓名占一行
        要求通过程序实现随机点名器
        第三次必定是张三同学
      运行效果:
        第一次运行程序:随机同学姓名1
        第二次运行程序:随机同学姓名2
        第三次运行程序:张三
    */

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("PracticeDay25\\src\\RollCallDevice03\\names.txt");
        ArrayList<String> NameList = new ArrayList<>();

        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = fr.read()) != -1) {
            if (ch != '\n') {
                sb.append((char)ch);
            }
            else {
                NameList.add(sb.toString().split("-")[0]);
                sb.delete(0, sb.length());
            }
        }
        Collections.shuffle(NameList);

        FileWriter fw1 = new FileWriter("PracticeDay25\\count.txt", true);
        FileReader fr1 = new FileReader("PracticeDay25\\count.txt");
        StringBuilder sb1 = new StringBuilder();
        char count = 'c';

        fw1.write(count);
        fw1.close();

        int b;
        while ((b = fr1.read()) != -1) {
            sb1.append(count);
            System.out.println(sb1.length());
        }

        if (sb1.length() <= 2) {
            System.out.println(NameList.get(0));
        }
        else {
            System.out.println("张三");
        }

        fr1.close();
        fr.close();
    }
}
