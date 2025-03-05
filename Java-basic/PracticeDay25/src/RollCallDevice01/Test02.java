package RollCallDevice01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test02 {
    /*
      随机点名器1:
      需求:
        有一个文件里面存储了班级同学的信息,每一个信息占一行
        格式为:张三-男-23
        要求通过程序实现随机点名器
      运行效果:
        第一次运行程序:随机同学姓名1(只显示名字)
        第二次运行程序:随机同学姓名2(只显示名字)
        第三次运行程序:随机同学姓名3(只显示名字)
        ...
    */

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("PracticeDay25\\src\\RollCallDevice01\\names.txt");
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
        System.out.println(NameList.get(0));
        fr.close();
    }
}
