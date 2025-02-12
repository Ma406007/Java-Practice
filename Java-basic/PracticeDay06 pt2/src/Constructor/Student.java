package Constructor;

//构造方法的格式
//public class Student {
//    修饰符 类名(参数) {
//
//    }
//}

//特点:1.方法名与类名相同
//    2.没有返回值类型，连void都没有
//    3.没有具体的返回值(不能由return带回结果数据)
//分为:无参构造和有参构造
//执行时机:1.创建对象的时候由虚拟机调用,不能手动调用构造方法 2.每创建一次对象,就会调用一次构造方法

public class Student {
    private String name;
    private int age;

    //如果我们自己没有写任何的构造方法
    //虚拟机会给我们加一个空参构造方法
    //如果我们自己写了一个构造方法
    //虚拟机会把自己的空参构造方法覆盖(不会再提供默认构造)
    //无参构造方法
    public Student() {
        System.out.println("无参构造方法");
    }
    //有参构造方法
    public Student(String name, int age) {
        System.out.println("有参构造方法");
        this.name = name;
        this.age = age;
    }
    //带参构造方法和无参构造方法可以同时存在,两者方法名相同,但是参数列表不同,这就是构造方法的重载
    //无论是否使用,都手动书写无参构造方法,和带全部参数的构造方法

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
}