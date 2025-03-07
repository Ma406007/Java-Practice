package MultiThreading;

import java.util.concurrent.*;

public class MyThreadTool {
    public static void main(String[] args) {
        /*
          创建自定义线程池
          线程池的核心元素:
            1.核心线程数量(不能小于0)
            2.线程池中最大线程的数量(最大数量 >= 核心线程数量)
            3.空闲时间(值)(不能小于0)
            4.空闲时间(单位)(用TimeUnit指定)
            5.阻塞队列(不能为null)
            6.创建线程的方式(不能为null)
            7.要执行的任务过多时的解决方案(不能为null)
        */

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, //核心线程数量(不能小于0)
                6, //线程池中最大线程的数量(最大数量 >= 核心线程数量)
                60, //空闲时间(值)(不能小于0)
                TimeUnit.SECONDS, //空闲时间(单位)(用TimeUnit指定)
                new ArrayBlockingQueue<>(3), //阻塞队列(不能为null)
                Executors.defaultThreadFactory(), //创建线程的方式(不能为null)
                new ThreadPoolExecutor.AbortPolicy() //要执行的任务过多时的解决方案(不能为null)
        );
    }
}
