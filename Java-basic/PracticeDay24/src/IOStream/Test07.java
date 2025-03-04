package IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("PracticeDay24\\Student1.txt"));

        ArrayList<student1> list = (ArrayList<student1>) ois.readObject();

        for (student1 student : list) {
            System.out.println(student);
        }

        ois.close();
    }
}
