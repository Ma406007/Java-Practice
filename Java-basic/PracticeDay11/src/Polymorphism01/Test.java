package Polymorphism01;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三", 18);
        Teacher t = new Teacher("李四", 30);
        Administrator a = new Administrator("王五", 25);

        //使用父类类型作为参数可以接收所有子类对象,体现了多态的扩展性与便利
        register(s);
        register(t);
        register(a);
    }

    //这个方法能接收老师,学生,管理员
    public static void register(Person person) {
        person.show();
    }
}
