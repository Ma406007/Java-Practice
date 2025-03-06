package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class BlockingQueue {
    /*
      阻塞队列的继承结构:
      Iterable(说明阻塞队列可以通过迭代器遍历)->Collection(说明阻塞队列是单列集合)->Queue->BlockingQueue->ArrayBlockingQueue(或LinkedBlockingQueue)
      细节:
        1.ArrayBlockingQueue的底层是数组,有界
        2.LinkedBlockingQueue的底层是链表,无界,但不上真正的无界,最大长度为INT_MAX
        3.除了ArrayBlockingQueue和LinkedBlockingQueue是实现类,其他四个均是接口,
    */

    public static void main(String[] args) {
        /*
          需求:利用阻塞队列完成生产者和消费者(等待唤醒机制)的代码
          细节:
            生产者和消费者必须使用同一个阻塞队列
        */

        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

        Consumer02 consumer = new Consumer02(arrayBlockingQueue);
        Producer02 producer = new Producer02(arrayBlockingQueue);

        consumer.setName("吃货");
        producer.setName("厨师");

        consumer.start();
        producer.start();
    }
}

class Consumer02 extends Thread {
    private ArrayBlockingQueue<String> queue;

    public Consumer02(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Producer02 extends Thread {
    private ArrayBlockingQueue<String> queue;
    public Producer02(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}