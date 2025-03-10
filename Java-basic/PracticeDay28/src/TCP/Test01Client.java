package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Test01Client {
    /*
      TCP通信练习1 --- 多发多收
        客户端:多次发送数据
        服务器:接收多次接收数据,并打印
    */

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("LAPTOP-6N8RGT4K", 10000);

        OutputStream os = socket.getOutputStream();
        String str;
        while (true) {
            str = sc.nextLine();
            os.write(str.getBytes());
            if (str.equals("bye")) {
                break;
            }
        }

        os.close();
        socket.close();
    }
}
