package Interface;

public abstract class Animal {
    public String name;
    public int age;

    public Animal() {}
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
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

    public abstract void eat();
}
