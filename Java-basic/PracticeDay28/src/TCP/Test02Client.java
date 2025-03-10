package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Test02Client {
    /*
      TCP通信练习2 --- 接收和反馈
        客户端:发送一条数据,接收服务端反馈的消息并打印
        服务器:接收数据并打印,再给客户端反馈消息
    */

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("LAPTOP-6N8RGT4K", 10000);

        OutputStream os = socket.getOutputStream();
        os.write("你好你好".getBytes());

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char)b);
        }

        os.close();
        socket.close();
    }
}
