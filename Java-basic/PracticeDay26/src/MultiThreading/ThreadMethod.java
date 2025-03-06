package MultiThreading;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        //成员方法
        //String getName() 返回此线程的名称
        //void setName(String name) 设置线程的名字(构造方法也可以设置名字)
        /*
          细节:
            1.如果没有给线程设置名字,线程也有默认名字:Thread-X(X为序号,默认从0开始)
            2.如果我们要给线程设置名字,可以用set方法进行设置,也可以重载构造方法设置
        */
        MyThread02 t1 = new MyThread02("线程1");
        MyThread02 t2 = new MyThread02("线程2");
        t1.start();
        t2.start();

        //static Thread currentThread() 获取当前线程的对象
        /*
          细节:
            当JVM虚拟机启动之后,会自动的启动多条线程
            其中有一条线程叫做main线程,作用就是去调用main方法并执行里面的代码
            之前写的所有代码都是在main线程当中执行的
        */
        //Thread t3 = Thread.currentThread();
        //String name = t3.getName();
        //System.out.println(name);


        //static void sleep(long time) 让线程休眠指定的时间,单位为毫秒
        /*
          细节:
            1.哪条线程执行到这个方法,哪条线程就会在这里停留对应的时间
            2.方法的参数:表示睡眠的时间,单位毫秒
            3.当时间到了之后,线程会自动醒来,继续执行下面的其他代码
        */
        //System.out.println("11111111");
        //Thread.sleep(5000);
        //System.out.println("22222222");
    }
}

class MyThread02 extends Thread {
    public MyThread02() {}
    public MyThread02(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName() + "@" + i);
        }
    }
}
