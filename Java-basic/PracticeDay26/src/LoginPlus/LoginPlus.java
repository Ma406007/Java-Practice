package LoginPlus;

import Login.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LoginPlus {
    /*
      需求:写一个登录小案例(添加锁定账号功能)
      步骤:
        将正确的用户名和密码手动保存在本地的userinfo.txt文件中
        保存格式为:username=zhangsan&password=123&count=0
        让用户键盘录入用户名和密码
        比较用户录入的和正确的用户名密码是否一致
        如果一致则打印登陆成功
        如果不一致则打印登陆失败,连续输错三次被锁定
    */

    public static void main(String[] args) throws IOException {
        Login.User user = new User("zhangsan", "123");
        BufferedReader br = new BufferedReader(new FileReader("PracticeDay26\\src\\LoginPlus\\userinfo.txt"));

        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, sb.toString().split("&"));

        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();

        int count = Integer.parseInt(list.get(2).split("=")[1]);
        if (count >= 3) {
            System.out.println("连续三次输入错误,账号已被锁定");
        }
        else {
            FileWriter fr = new FileWriter("PracticeDay26\\src\\LoginPlus\\userinfo.txt", false);
            if (username.equals(list.get(0).split("=")[1]) && password.equals(list.get(1).split("=")[1])) {
                fr.write("username=zhangsan&password=123&count=0");
                System.out.println("登陆成功");
            }
            else {
                fr.write("username=zhangsan&password=123&count=" + (count + 1));
                System.out.println("登陆失败");
            }
            fr.close();
        }

        br.close();
    }
}
