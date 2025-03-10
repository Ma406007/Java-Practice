package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatRoomSender {
    /*
      按照下面的要求实现程序
        UDP发送数据:数据来自于键盘录入,直到录入的数据是886,发送数据结束
        UDP接收数据:因为接收端不知道发送端什么时候停止发送,故采用死循环接收
    */

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();

        while (true) {
            String str = sc.nextLine();
            if (str.equals("886")) {
                break;
            }
            byte[] buf = str.getBytes();
            InetAddress address = InetAddress.getByName("LAPTOP-6N8RGT4K");
            int port = 10086;

            DatagramPacket dp = new DatagramPacket(buf, buf.length, address, port);

            ds.send(dp);
        }

        ds.close();
    }
}
