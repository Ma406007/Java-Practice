package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylisttest03 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();

        stu1.setName("张三");
        stu1.setAge(20);
        stu2.setName("李四");
        stu2.setAge(21);
        stu3.setName("王五");
        stu3.setAge(22);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            stu.setName(sc.next());
            stu.setAge(sc.nextInt());
            list.add(stu);
        }

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i).getName() + list.get(i).getAge());
            }
            else {
                System.out.print(list.get(i).getName() + list.get(i).getAge() + ", ");
            }
        }
        System.out.print("]");
    }
}
