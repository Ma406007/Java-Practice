package Util;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {}

    public static int getMaxAge(ArrayList<Student> students) {
        int maxAge = students.get(0).getAge();

        for (int i = 0; i < students.size(); i++) {
            int tmpAge = students.get(i).getAge();
            if (tmpAge > maxAge) {
                maxAge = students.get(i).getAge();
            }
        }
        return maxAge;
    }
}
