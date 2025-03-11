package JavaReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class TakeConstructor {
    /*
      Java中万物皆对象
        1.构造方法是Constructor类的对象
        2.成员变量是Field类的对象
        3.成员方法是Method类的对象
    */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("JavaReflection.Student02");
        //利用反射获取构造方法
        //Class类中用于获取构造方法的方法
        //1.Constructor<?>[] getConstructors() 返回所有公共(public修饰)构造方法对象的数组
        //Constructor[] constructors1 = clazz.getConstructors();
        //for (Constructor constructor : constructors1) {
        //    System.out.println(constructor);
        //}

        //2.Constructor<?>[] getDeclaredConstructors() 返回所有构造方法对象的数组
        //Constructor[] constructors2 = clazz.getDeclaredConstructors();
        //for (Constructor constructor : constructors2) {
        //    System.out.println(constructor);
        //}

        //3.Constructor<T> getConstructor(Class<?>... parameterTypes) 返回单个公共(public修饰)构造方法对象
        //Constructor constructor1 = clazz.getConstructor();
        //System.out.println(constructor1);
        //细节:getConstructor方法的形参应传入类中public修饰的构造方法的形参类型的字节码文件
        //Constructor constructor2 = clazz.getConstructor(String.class);
        //System.out.println(constructor2);

        //4.Constructor<T> getDeclaredConstructor<Class<?>... parameterTypes> 返回单个构造方法对象
        //细节:getDeclaredConstructor方法的形参应传入类中构造方法的形参类型的字节码文件
        //Constructor constructor3 = clazz.getDeclaredConstructor(int.class);
        //System.out.println(constructor3);
        Constructor constructor4 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor4);

        //Constructor类中用于创建对象的方法
        //1.T newInstance(Object... initargs) 根据指定的构造方法创建对象
        //2.setAccessible(boolean flag) flag为true表示取消访问检查
        constructor4.setAccessible(true);
        Student02 student = (Student02)constructor4.newInstance("张三", 23);
        System.out.println(student);

        //getModifiers()方法返回int类型值表示该成员方法和成员变量的修饰符
        //public:1
        //private:2
        //protected:4
        //static:8
        //final:16
        //synchronized:32
        //volatile:64
        //transient:128
        //native:256
        //interface:512
        //abstract:1024
        //strict:2048
        int modifier = constructor4.getModifiers();
        System.out.println(modifier);
    }
}

class Student02 {
    private String name;
    private int age;

    public Student02() {}
    public Student02(String name) {
        this.name = name;
    }
    protected Student02(int age) {
        this.age = age;
    }
    private Student02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
