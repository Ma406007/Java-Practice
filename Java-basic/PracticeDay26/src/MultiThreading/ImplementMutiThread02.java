package MultiThreading;

public class ImplementMutiThread02 {
    /*
      多线程的第二种启动方式:
        1.自己定义一个类实现Runnable接口
        2.重写里面的run方法
        3.创建自己的类的对象
        4.创建一个Thread类的对象,并开启线程
    */

    public static void main(String[] args) {
        MyRun01 mr = new MyRun01();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class MyRun01 implements Runnable {
    @Override
    public void run() {
        //线程要执行的代码
        for (int i = 0; i < 100; i++) {
            //获取当前线程对象的名字
            System.out.println(Thread.currentThread().getName() + "HelloWorld");
        }
    }
}
