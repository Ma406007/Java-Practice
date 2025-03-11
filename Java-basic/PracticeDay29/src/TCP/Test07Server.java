package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test07Server {
    /*
      TCP通信练习7 --- BS(接收浏览器的消息并打印)
      客户端:不用写
      服务器:接收数据并打印
    */

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char)b);
        }

        is.close();
        socket.close();
    }

    //打开一个浏览器输入 本机IP地址:端口号 即可
}
