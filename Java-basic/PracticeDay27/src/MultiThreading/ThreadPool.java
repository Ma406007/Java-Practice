package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    //线程池:在应用程序启动时创建一定数量的线程,并将它们保存在线程池中.
    //当需要执行任务时,从线程池中获取一个空闲的线程,将任务分配给该线程执行.当任务执行完毕后,线程将返回到线程池,可以被其他任务复用.

    /*

      线程池的主要核心原理
        1.创建一个池子,池子中是空的
        2.提交任务时,池子会创建新的线程对象,任务实行完毕,线程会被归还给池子
          下回再次提交任务时,就不需要创建新的线程,直接复用已有的线程
        3.但是如果提交任务时,池子中没有空闲线程,也无法创建新的线程,任务就会排队等待
    */

    public static void main(String[] args) {
        //线程池代码实现
        //Executors:线程池的工具类,通过调用方法返回不同类型的线程池对象
        //构造方法
        //public static ExecutorService newCachedThreadPool() 创建一个没有上限(实际上大小为INT_MAX)的线程池
//        ExecutorService pool1 = Executors.newCachedThreadPool();
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());

        //public static ExecutorService newFixedThreadPool(int nThreads) 创建一个有上限的线程池
        ExecutorService pool2 = Executors.newFixedThreadPool(3);
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}