package AnonymityInternalClass;

public class Test {
    //没有名字的成员内部类
    Swim s = new Swim() {
        @Override
        public void swim() {
            System.out.println("重写了swim()方法");
        }
    };

    public static void main(String[] args) {
        //匿名内部类就说隐藏了名字的内部类,可以写在成员位置和局部位置,整体是一个类的子类对象或一个接口的实现类对象
        //new 类名或者接口名() {重写方法;};

        //接口:
        //实现关系 方法重写 创建对象
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了swim()方法");
            }
        };//没有名字的局部内部类

        //类:
        //继承关系 方法重写 创建对象
        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了eat()方法");
            }
        };//没有名字的局部内部类

        //匿名内部类应用场景
        //可以直接跳过创建子类继承抽象类
        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );

        //接口多态
        Swim swim = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了swim()方法");
            }
        };
        swim.swim();

        //调用自己类中方法
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了swim()方法");
            }
        }.swim();
    }

    public static void method(Animal animal) {
        animal.eat();
    }
}
