package MultiThreading;

public class SynchronizedMethod {
    /*
      同步方法:就是把synchronized关键字加到方法上
      格式:
        修饰符 synchronized 返回值类型 方法名(方法参数) {...}
      特点:
        1.同步方法是锁住方法里面所有的代码
        2.锁对象不能自己指定 非静态:this 静态:当前类的字节码文件对象
    */
    public static void main(String[] args) {
        /*
          需求:某电影院目前正在上映国产大片,共有100张票,而它有3个窗口卖票,请估计一个程序模拟该电影院卖票
          利用同步方法完成
        */

        Window02 window = new Window02();

        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Window02 implements Runnable {
    //此时用的是的第二种方法实现多线程
    //因此所有的线程对象都共用total,不必再加static修饰
    int total = 0;

    @Override
    public void run() {
        while (true) {
            if (method()) {
                break;
            }
        }
    }

    private synchronized boolean method() {
        if (total < 100) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            total++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + total + "张票");
        }
        else {
            return true;
        }
        return false;
    }
}