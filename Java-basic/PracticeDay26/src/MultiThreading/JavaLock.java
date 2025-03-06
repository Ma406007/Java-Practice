package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class JavaLock {
    /*
      虽然可以理解同步代码块和同步方法的锁对象问题,但是并没有直接看到在哪里加上了锁,在哪里释放了锁
      为了更清晰的表达如何加锁和释放锁,JDK5以后提供了一个新的锁对象Lock
      Lock实现提供比使用synchronized方法和语句可以获得更广泛的锁定操作
    */
    public static void main(String[] args) {
        //Lock中提供了获得锁和释放锁的方法,可以实现手动上锁和释放锁
        //void lock() 获得锁
        //void unlock() 释放锁

        //由于Lock是接口,不能直接实例化,只能采用它的实现类ReentrantLock来实例化
        //构造方法
        //ReentrantLock() 创建一个ReentrantLock的对象

        Window03 w1 = new Window03();
        Window03 w2 = new Window03();
        Window03 w3 = new Window03();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window03 extends Thread {
    static int total = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //synchronized (Window01.class) {
            lock.lock();
            try {
                if (total < 100) {
                    Thread.sleep(50);
                    total++;
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + total + "张票");
                } else {
                    break;
                }
            //}
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}

