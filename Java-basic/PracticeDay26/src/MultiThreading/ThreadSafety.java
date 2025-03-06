package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadSafety {
    /*
      需求:
      某电影院目前正在上映国产大片,共有100张票,而它有3个窗口卖票,请设计一个程序模拟该电影院卖票
    */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Window01 w1 = new Window01();
        Window01 w2 = new Window01();
        Window01 w3 = new Window01();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window01 extends Thread {
    static int total = 0;

    @Override
    public void run() {
        /*
          同步代码块:把操作共享数据的代码锁起来
          格式:
          synchronized(锁对象) {
              操作共享数据的对象
          }
          特点:
            1.锁默认打开,有一个线程进去了,锁自动关闭
            2.里面的代码全部执行完毕,线程出来,锁自动打开
          细节:
            1.锁对象一定是唯一的(static修饰)
            2.锁对象可以是任意类型的对象(Object及其子类)
            3.锁对象一般是一个类的字节码文件对象:类名.class
        */

        while (true) {
            synchronized (Window01.class) {
                if (total < 100) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    total++;
                    System.out.println(this.getName() + "正在卖第" + total + "张票");
                }
                else {
                    break;
                }
            }
        }
    }
}