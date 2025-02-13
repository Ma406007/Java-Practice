package Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student(1, "John", 18);
        students[1] = new Student(2, "Jane", 19);
        students[2] = new Student(3, "Jack", 20);

        //1.再次添加一个学生对象并在添加的时候进行学号的唯一性判断
        Student student1 = new Student(4, "Jill", 21);
        if (checkId(students, student1)) {
            System.out.println("学号重复");
        }
        else {
            if (getCount(students) == students.length) {
                Student[] newstudents = new Student[students.length + 1];
                copyArray(students, newstudents);
                newstudents[students.length] = student1;

                //2.遍历所有学生对象
                //printArray(newstudents);
            }
            else {
                students[getCount(students)] =  student1;

                //2.遍历所有学生对象
                //printArray(students);
            }
        }

        //3.通过id删除学生信息
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入要删除的学生的id:");
//        int id = sc.nextInt();
//        if (getIndex(students, id) != -1) {
//            deleteStudent(students, id);
//            printArray(students);
//        }
//        else {
//            System.out.println("id不存在,删除失败");
//        }

        //4.查询id为2的学生,如果存在,将他的年龄+1
        if (getIndex(students, 2)!= -1) {
            students[getIndex(students, 2)].setAge(students[getIndex(students, 2)].getAge() + 1);
            printArray(students);
        }
        else {
            System.out.println("id不存在,修改失败");
        }
    }

    public static void deleteStudent(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                students[i] = null;
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("id不存在,删除失败");
    }

    public static int getIndex(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void printArray(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getId()  + " " + students[i].getName() + " " + students[i].getAge());
            }
        }
    }

    public static void copyArray(Student[] students, Student[] newstudents) {
        for (int i = 0; i < students.length; i++) {
            newstudents[i] = students[i];
        }
    }

    public static int getCount(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkId(Student[] students, Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == student.getId()) {
                return true;
            }
        }
        return false;
    }
}
