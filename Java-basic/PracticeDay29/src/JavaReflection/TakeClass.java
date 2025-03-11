package JavaReflection;

public class TakeClass {
    /*
      创建一个类的对象,分为以下三个阶段:
        1.编写A.java文件并将其编译为A.class字节码文件(这个阶段没有把代码加载到内存当中,是在硬盘中操作) --- 源代码阶段
        2.将A.class字节码文件加载到内存当中 --- 加载阶段
        3.在内存当中创建这个类的对象(即A a = new A()) --- 运行阶段
    */

    public static void main(String[] args) throws ClassNotFoundException {
        //获取class对象的三种方式
        //1.Class.forName("全类名"); --- 源代码阶段
        //全类名:包名+类名
        //最为常用
        Class clazz1 = Class.forName("JavaReflection.TakeClass$Student01");
        System.out.println(clazz1);

        //2.类名.class --- 加载阶段
        //一般更多的是当做参数进行传递,例如synchronized
        Class clazz2 = Student01.class;
        System.out.println(clazz2);

        //3.对象.getClass(); --- 运行阶段
        //当我们已经有了这个类的对象时才可以使用
        Student01 student = new Student01();
        Class clazz3 = student.getClass();
        System.out.println(clazz3);
    }
}

class Student01 {
    private String name;
    private int age;

    public Student01() {
    }

    public Student01(String name, int age) {
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

    public String toString() {
        return "Student01{" + "name=" + name + ", age=" + age + '}';
    }
}
