package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test06 {
    /*
      需求:
      将多个自定义对象序列化到文件中,但是对象的个数不确定,该如何操作?
    */

    public static void main(String[] args) throws IOException {
        student1 student1 = new student1("张三", 23, "青岛");
        student1 student2 = new student1("李四", 24, "深圳");
        student1 student3 = new student1("王五", 25, "上海");

        ArrayList<student1> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("PracticeDay24\\Student1.txt"));
        oos.writeObject(students);
        oos.close();
    }
}

