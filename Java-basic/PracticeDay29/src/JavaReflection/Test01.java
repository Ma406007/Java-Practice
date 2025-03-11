package JavaReflection;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test01 {
    /*
      保存信息
      对于任意一个对象,都可以把对象所有的字段名和值,保存到文件中去
    */

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException {
        FileWriter fw = new FileWriter("PracticeDay29\\src\\JavaReflection\\Information.txt");

        Student1 student = new Student1("小A", 23, '女', 167.5, "睡觉");
        Teacher1 teacher = new Teacher1("播妞", 10000);

        saveObject(student, fw);

        fw.close();
    }

    public static void saveObject(Object obj, FileWriter fw) throws IOException, ClassNotFoundException, IllegalAccessException {
        Class clazz = obj.getClass();

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            String name = field.getName();
            Object value = field.get(obj);

            fw.write(name + "=" + value);
            fw.write("\n");
        }
    }
}

