package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest02 {
    /*
      有100份礼品,两人同时发送,当剩下的礼品小于10份的时候则不再送出
      利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来
    */

    public static void main(String[] args) {
        people1 people1 = new people1();
        people1 people2 = new people1();

        people1.setName("人1");
        people2.setName("人2");

        people1.start();
        people2.start();
    }
}

class people1 extends Thread {
    static int total = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (total < 90) {
                    Thread.sleep(50);
                    total++;
                    System.out.println(Thread.currentThread().getName() + "送出了第" + total + "份礼物,还剩" + (100 - total) + "份礼物");
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
