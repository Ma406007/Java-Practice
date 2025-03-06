package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ImplementMutiThread03 {
    /*
      多线程的第三种实现方式:
        特点:可以获取到多线程运行的结果
        1.创建一个类MyCallable实现Callable接口
        2.重写call(是有返回值的,表示多线程运行的结果)

        3.创建MyCallable的对象(表示多线程要执行的任务)
        4.创建FutureTask的对象(用来管理多线程运行的结果,需要与结果的类型一致)
        5.创建Thread类的对象,并启动(表示线程)
    */

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();

        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);

        Thread thread = new Thread(futureTask);
        thread.start();

        int result = futureTask.get();
        System.out.println(result);
    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
