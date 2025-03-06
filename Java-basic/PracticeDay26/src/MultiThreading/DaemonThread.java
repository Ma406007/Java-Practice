package MultiThreading;

public class DaemonThread {
    public static void main(String[] args) {
        //成员方法
        //final void setDaemon(boolean on) 设置为守护线程
        //细节:当其他的非守护线程执行完毕时,守护线程会陆续结束

        MyThread03 t1 = new MyThread03();
        MyThread04 t2 = new MyThread04();

        t1.setName("线程");
        t2.setName("守护线程");

        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}

class MyThread03 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getName() + "@" + i);
        }
    }
}

class MyThread04 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(this.getName() + "@" + i);
        }
    }
}