package MultiThreading;

public class ImplementMutiThread01 {
    /*
      多线程的第一种启动方式:
        1.自己定义一个类继承Thread类
        2.重写run方法
        3.创建子类对象,并启动线程
    */

    public static void main(String[] args) {
        MyThread01 Thread01 = new MyThread01();
        MyThread01 Thread02 = new MyThread01();

        Thread01.setName("线程1");
        Thread02.setName("线程2");

        //开启线程
        Thread01.start();
        Thread02.start();
    }
}

class MyThread01 extends Thread {
    @Override
    public void run() {
        //线程要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + "HelloWorld");
        }
    }
}
