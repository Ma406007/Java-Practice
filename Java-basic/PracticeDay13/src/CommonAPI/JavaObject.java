package CommonAPI;

//Object是Java中的顶级父类,所有的类都直接或间接继承于Object
//Object类中的方法可以被所有子类访问

public class JavaObject {
    //public Object() 无参构造(Object中只有无参构造)

    //public String toString() 返回对象的字符串表示形式(返回包+类名+地址值,如果想看到对象内容就重写)
    //public boolean equals(Object obj) 比较两个对象是否相等(比较地址值,如果要比较内容就重写)
    //protected Object clone(int a) 对象拷贝

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(new Object().toString());
        //细节:类名System 静态变量out 获取打印的对象System.out 方法println() 参数表示打印的内容
        //当我们打印一个对象的时候,底层会直接调用对象的toString()方法把对象变成字符串
        //如果想看到对象的内容就进行toString()方法的重写
        System.out.println(new Object());

        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,  11, 12, 13, 14, 15, 0};
        User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);

        User u2 = (User)u1.clone();

        //Object中的拷贝是浅拷贝
        //如果要深拷贝则需要clone()方法的重写
        int[] arr = u1.getData();
        arr[0] = 100;

        System.out.println(u1);
        System.out.println(u2);
    }
}
