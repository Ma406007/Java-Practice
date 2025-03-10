package IOStream;

import java.io.Serializable;

class student1 implements Serializable {
    private static final long serialVersionUID = 2L;

    private String name;
    private int age;
    private String address;

    public student1() {
    }

    public student1(String name, int age, String address) {
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

    @Override
    public String toString() {
        return "student1[" + name + ',' + age + ',' + address + ']';
    }
}
