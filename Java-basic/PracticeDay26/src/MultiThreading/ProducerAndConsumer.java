package MultiThreading;

public class ProducerAndConsumer {
    /*
      需求:完成生产者和消费者(等待唤醒机制)的代码来实现线程轮流交替执行的效果
    */
    public static void main(String[] args) {
        Consumer01 consumer = new Consumer01();
        Producer01 producer = new Producer01();

        consumer.setName("吃货");
        producer.setName("厨师");

        consumer.start();
        producer.start();
    }
}

class Consumer01 extends Thread {
    @Override
    public void run() {
        /*
          1.循环
          2.同步代码块
          3.判断共享数据是否到了末尾(到了末尾)
          4.判断共享数据是否到了末尾(没有到末尾,执行核心逻辑)
        */

        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }
                else {
                    //先判断桌子上是否有面条
                    if (Desk.foodFlag == 0) {
                        //如果没有就等待
                        try {
                            Desk.lock.wait();//让当前进程和锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else {
                        //把执行次数减一
                        Desk.count--;
                        //如果有就开吃
                        System.out.println("消费者在吃面条,还能吃" + Desk.count + "碗面");
                        //吃完之后唤醒厨师做
                        Desk.lock.notifyAll();//唤醒和Desk.lock绑定的线程
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}

class Producer01 extends Thread {
    @Override
    public void run() {
        /*
          1.循环
          2.同步代码块
          3.判断共享数据是否到了末尾(到了末尾)
          4.判断共享数据是否到了末尾(没有到末尾,执行核心逻辑)
        */

        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }
                else {
                    //先判断桌子上是否有面条
                    if (Desk.foodFlag == 0) {
                        //如果没有就制作食物
                        System.out.println("厨师做了一碗面条");
                        Desk.foodFlag = 1;
                        //把食物放在桌子上并唤醒等待的消费者
                        Desk.lock.notifyAll();
                    }
                    else {
                        //如果有就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}

class Desk {
    //作用:控制生产者和消费者的执行

    //表示是否有面条 0:没有 1:有
    public static int foodFlag = 0;

    //总执行次数
    public static int count = 10;

    //锁对象
    public static Object lock = new Object();
}