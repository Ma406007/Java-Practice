package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test05Server {
    /*
      TCP通信练习5 --- 上传文件(多线程版)
      想要服务器不停止,能接收很多用户上传的图片
      提示:可以用循环或者多线程
      但是循环不合理,最优解法是(循环 + 多线程)改写
    */

    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。

        //1.创建对象并绑定端口
        ServerSocket ss = new ServerSocket(10000);

        while (true) {
            //2.等待客户端来连接
            Socket socket = ss.accept();

            //开启一条线程
            //一个用户就对应服务端的一条线程
            new Thread(new MyRunnable(socket)).start();
        }

    }
}
