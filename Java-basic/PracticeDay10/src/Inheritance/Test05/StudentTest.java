package Inheritance.Test05;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("张三", 23, "传智大学");

        System.out.println("姓名:" + s2.name + " 年龄:" + s2.age + " 学校:" + s2.school);
    }
}

//this,super使用总结
//this理解为一个变量,表示当前方法调用者的地址值
//super代表父类存储空间

//this:
//this.成员变量 访问本类成员变量
//this.成员方法(...) 访问本类成员方法
//this(...) 访问本类构造方法

//super:
//super.成员变量 访问父类成员变量
//super.成员方法(...) 访问父类成员方法
//super(...) 访问父类构造方法