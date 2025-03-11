package JavaReflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TakeMethod {
    /*
      Java中万物皆对象
        1.构造方法是Constructor类的对象
        2.成员变量是Field类的对象
        3.成员方法是Method类的对象
    */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = Class.forName("JavaReflection.Student04");
        //利用反射获取成员方法
        //Class类中用于获取成员方法的方法
        //1.Method[] getMethods() 返回所有公共(public修饰)成员方法(包括继承)对象的数组
        //Method[] methods1 = clazz.getMethods();
        //for (Method method : methods1) {
        //    System.out.println(method);
        //}

        //2.Method[] getDeclaredMethods() 返回所有成员方法(不包括继承)对象的数组
        //Method[] methods2 = clazz.getDeclaredMethods();
        //for (Method method : methods2) {
        //    System.out.println(method);
        //}

        //3.Method getMethod(String name, Class<?>... parameterTypes) 返回单个公共(public修饰)成员方法对象
        //细节:可用来区别方法重写
        //Method method1 = clazz.getMethod("eat", String.class, int.class);
        //System.out.println(method1);

        //4.Method getDeclaredMethod(String name, Class<?>...parameterTypes) 返回单个成员方法对象
        Method method2 = clazz.getDeclaredMethod("eat", String.class);
        //System.out.println(method2);

        //获取方法的修饰符
        int modifier = method2.getModifiers();
        System.out.println(modifier);

        //获取方法的名字
        String name = method2.getName();
        System.out.println(name);

        //获取方法的形参
        Parameter[] parameters = method2.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //获取方法抛出的异常
        //Class[] exceptions = method2.getExceptionTypes();
        //for (Class exception : exceptions) {
        //    System.out.println(exception);
        //}

        //Method类中用于创建对象的方法
        /*
          Object invoke(Object obj, Object... args) 运行方法
          参数一:用obj对象调用该方法
          参数二:调用方法的传递的参数() (如果没有就不写)
          返回值:方法的返回值(如果没有就不写)
        */
        Student04 student = new Student04();
        method2.setAccessible(true);
        System.out.println(method2.invoke(student, "汉堡包"));
    }
}

class Student04 {
    private String name;
    private int age;

    public Student04() {}
    public Student04(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void sleep() {
        System.out.println("睡觉");
    }

    private String eat(String food) throws IOException,  ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        System.out.println("在吃" + food);
        return "奥利给";
    }

    public void eat(String food, int num) {
        System.out.println("在吃" + food);
    }

    @Override
    public String toString() {
        return "Student04{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
