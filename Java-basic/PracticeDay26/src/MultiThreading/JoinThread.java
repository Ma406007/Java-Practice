package MultiThreading;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        //成员方法
        //public static void join() 插入线程/插队线程
        MyThread01 t = new MyThread01();
        t.setName("线程1");
        t.start();

        //表示把t这个线程插入到当前线程之前
        //t:线程1
        //当前线程:main
        t.join();

        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "@" + i);
        }
    }
}