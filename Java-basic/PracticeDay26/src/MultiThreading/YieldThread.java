package MultiThreading;

public class YieldThread {
    public static void main(String[] args) {
        //成员方法
        //public static void yield() 出让线程/礼让线程
        //细节:会尽可能的让结果均匀点
        MyThread05 t1 = new MyThread05();
        MyThread05 t2 = new MyThread05();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class MyThread05 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(this.getName() + "@" + i);
            Thread.yield();
        }
    }
}