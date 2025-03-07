package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest03 {
    /*
      同时开启两个线程,共同获取1-100之间的数字
      要求:输出所有的奇数
    */
    public static void main(String[] args) {
        thread t1 = new thread();
        thread t2 = new thread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class thread extends Thread {
    static int total = 1;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (total < 100) {
                    if (total % 2 == 1) {
                        Thread.sleep(50);
                        System.out.println(Thread.currentThread().getName() + "拿到了" + total);
                    }
                    total++;
                }
                else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}