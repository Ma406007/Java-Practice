package IOStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
    /*
      软件运行次数
      实现一个验证程序运行次数的小程序,要求如下:
        1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
        2.程序运行演示如下:
          第一次运行控制台输出:欢迎使用本软件,第1次使用免费~
          第二次运行控制台输出:欢迎使用本软件,第2次使用免费~
          第三次运行控制台输出:欢迎使用本软件,第3次使用免费~
          第四次及以后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
    */

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("PracticeDay24\\use.txt", true);
        FileReader fr = new FileReader("PracticeDay24\\use.txt");
        char count = 'c';
        fw.write(count);

        int len = 1;
        int b;
        while ((b = fr.read()) != -1) {
            len++;
        }

        if (len <= 3) {
            System.out.println("欢迎使用本软件,第" + len + "次使用免费");
        }
        else {
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用");
        }

        fr.close();
        fw.close();
    }
}
