package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建服务器端的Socket对象(ServerSocket)
        ServerSocket ss = new ServerSocket(10000);

        //2.监听客户端连接,返回一个Socket对象
        Socket socket = ss.accept();

        //3.获取输入流,读数据,并把数据显示在控制台
        InputStream is = socket.getInputStream();
        //利用转换流解决中文乱码问题
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char)b);
        }

        //4.释放资源
        is.close();
        socket.close();
    }
}
