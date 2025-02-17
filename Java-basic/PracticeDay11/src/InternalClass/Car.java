package InternalClass;

//类的五大成员:属性,方法,构造方法,代码块,内部类
//在一个类的里面再定义一个类,里面被定义的类就叫内部类.比如在A类的内部定义B类,B类就被称为内部类

//内部类分为四种:成员内部类,静态内部类,局部内部类,匿名内部类

public class Car {
    private String brand;
    private String color;
    private int age;
    static int a = 1;
    //内部类表示的事物是外部类的一部分,内部类单独出现没有任何意义
    //成员内部类可以被一些修饰符修饰,如private,默认,protected,public,static等
    //静态内部类只能访问外部类中的静态变量和静态方法
    //局部内部类是定义在方法里面的内部类,类似于方法中的局部变量,外界无法直接使用,需要在方法内创建对象并使用,该类可以直接访问外部类的成员也可以访问方法内的局部变量
    static class Engine {
        //在成员内部类里,JAK16之前不能定义静态变量,JDK16开始才可以定义静态变量
        private String name;
        private int age;

        public Engine() {}
        public Engine(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public void show() {
            //内部类可以直接访问外部类的成员(包括私有)
            //静态内部类如果想访问非静态变量和方法需要创建外部类对象,如果调用静态方法则不用创建对象:外部类名.内部类名.方法名()
            Car car = new Car();

            System.out.println(name);
            System.out.println(car.brand);
            System.out.println(a);
        }

        //当外部类成员变量和内部类成员变量重名时,在内部类访问外部类成员变量:
        //外部类名.this.变量名
        //public void showCarAge() {
        //    System.out.println(Car.this.age);
        //}
    }

    public Car() {}
    public Car(String brand, String color, int age) {
        this.brand = brand;
        this.color = color;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Engine getEngine() {
        return new Engine();
    }

    public void show() {
        //外部类要访问内部类的成员,必须先创建对象
        Engine engine = new Engine();
        System.out.println(engine.name);
    }
}
