package User;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylisttest04 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user1 = new User("001", "张三", "123456");
        User user2 = new User("002", "李四", "123456");
        User user3 = new User("003", "王五", "123456");
        list.add(user1);
        list.add(user2);
        list.add(user3);

        Scanner sc = new Scanner(System.in);
        while (true) {
            if (check2(list, sc.next()) != -1) {
                System.out.println("查询成功");
            }
            else {
                System.out.println("查询失败");
            }
        }
    }

    public static boolean check1(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static int check2(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
