package TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test06Server {
    /*
      TCP通信练习6 --- 上传文件(线程池优化)
      频繁创建线程并销毁非常浪费系统资源,故要使用线程池优化
    */

    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。

        //1.创建对象并绑定端口
        ServerSocket ss = new ServerSocket(10000);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, //核心线程数量(不能小于0)
                6, //线程池中最大线程的数量(最大数量 >= 核心线程数量)
                60, //空闲时间(值)(不能小于0)
                TimeUnit.SECONDS, //空闲时间(单位)(用TimeUnit指定)
                new ArrayBlockingQueue<>(3), //阻塞队列(不能为null)
                Executors.defaultThreadFactory(), //创建线程的方式(不能为null)
                new ThreadPoolExecutor.AbortPolicy() //要执行的任务过多时的解决方案(不能为null)
        );

        while (true) {
            //2.等待客户端来连接
            Socket socket = ss.accept();

            //开启一条线程
            //一个用户就对应服务端的一条线程
            pool.submit(new MyRunnable(socket));
        }

    }
}
