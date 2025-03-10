package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatRoomReceiver {
    /*
      按照下面的要求实现程序
        UDP发送数据:数据来自于键盘录入,直到录入的数据是886,发送数据结束
        UDP接收数据:因为接收端不知道发送端什么时候停止发送,故采用死循环接收
    */

    public static void main(String[] args)  throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        while (true) {
            ds.receive(dp);

            byte[] data = dp.getData();
            int len = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();

            System.out.println("接收到数据:" + new String(data, 0, len));
            System.out.println("该数据是从" + address + "这台电脑中的" + port + "端口发出的");
        }
    }
}
