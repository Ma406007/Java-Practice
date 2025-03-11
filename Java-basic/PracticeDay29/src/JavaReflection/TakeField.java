package JavaReflection;

import java.lang.reflect.Field;

public class TakeField {
    /*
      Java中万物皆对象
        1.构造方法是Constructor类的对象
        2.成员变量是Field类的对象
        3.成员方法是Method类的对象
    */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("JavaReflection.Student03");
        //利用反射获取成员变量
        //Class类中用于获取成员变量的方法
        //1.Field[] getFields() 返回所有公共(public修饰)成员变量对象的数组
        //Field[] fields1 = clazz.getFields();
        //for (Field field : fields1) {
        //    System.out.println(field);
        //}

        //2.Field[] getDeclaredFields() 返回所有成员变量对象的数组
        //Field[] fields2 = clazz.getDeclaredFields();
        //for (Field field : fields2) {
        //    System.out.println(field);
        //}

        //3.Field getField(String name) 返回单个公共(public修饰)成员变量对象
        //Field field1 = clazz.getField("gender");
        //System.out.println(field1);

        //4.Field getDeclaredField(String name) 返回单个成员变量对象
        Field field2 = clazz.getDeclaredField("name");
        //System.out.println(field2);

        //获取权限修饰符
        //int modifier = field2.getModifiers();
        //System.out.println(modifier);

        //获取成员变量的名字
        //String name = field2.getName();
        //System.out.println(name);

        //获取成员变量的数据类型
        //Class<?> type = field2.getType();
        //System.out.println(type);

        //Field类中用于创建对象的方法
        //1.void set(Object obj, Object value) 赋值
        //2.Object get(Object obj) 获得值
        Student03 student = new Student03("zhangsan", 23, "男");
        field2.setAccessible(true);
        //String value = (String)field2.get(student);
        //System.out.println(value);
        System.out.println(student);

        field2.set(student, "lisi");
        System.out.println(student);
    }
}

class Student03 {
    private String name;
    private int age;
    public String gender;

    public Student03() {}
    public Student03(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student03{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
