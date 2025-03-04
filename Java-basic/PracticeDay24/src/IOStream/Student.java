package IOStream;

import java.io.Serializable;

//Serializable接口里面是没有抽象方法的,即标记型接口
//一旦实现了这个接口就表示当前的Student类可以被序列化
class Student implements Serializable {
    //版本号
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    //如果想有某个成员变量不被序列化到本地文件要加关键字transient:瞬态关键字
    //其作用就是防止被修饰的成员变量序列化到本地文件
    private transient String address;

    public Student() {
    }

    public Student(String name, int age,  String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}
