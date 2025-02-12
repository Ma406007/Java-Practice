package GirlFriend;

public class GirlFriend {
    private String name;
    private int age;

    public void sleep() {
        System.out.println("女朋友在睡觉");
    }
    public void eat() {
        System.out.println("女朋友在吃饭");
    }

    public void SetName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a >= 18 && a <= 25) {
            age = a;
        }
        else {
            System.out.println("年龄不合法");
        }
    }
    public int getAge() {
        return age;
    }
    //成员变量和局部变量遵循就近原则
    //如果成员变量和局部变量重名那么在方法中使用的是局部变量
    //如果要在方法中使用成员变量那么需要使用this关键字
}
