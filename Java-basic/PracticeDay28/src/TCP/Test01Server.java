package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01Server {
    /*
      TCP通信练习1 --- 多发多收
        客户端:多次发送数据
        服务器:接收多次接收数据,并打印
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
}
