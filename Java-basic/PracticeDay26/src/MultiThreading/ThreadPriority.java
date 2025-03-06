package MultiThreading;

public class ThreadPriority {
    //抢占式调度:多个线程抢夺CPU的执行权,CPU执行哪条线程是不确定的,执行时间也是不确定的,体现随机性,Java中的调度方法为抢占式调度
    //非抢占式调度:所有线程轮流执行,执行时间大致相同

    //一个线程的优先级越大,该线程被执行的概率越大,Java中优先级分为10档,最小1,最大10,默认5
    public static void main(String[] args) {
        //成员方法
        //setPriority(int newPriority) 设置线程的优先级
        //final int getPriority() 获取线程的优先级
        MyRun02 myRun01 = new MyRun02();

        Thread t1 = new Thread(myRun01, "线程1");
        Thread t2 = new Thread(myRun01, "线程2");

        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}

class MyRun02 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}