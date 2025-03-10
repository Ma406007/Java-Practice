package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        //UDP通信程序(接收数据)
        //1.创建接收端的DatagramSocket对象
        /*
          细节:
          在接收的时候一定要绑定端口
          而且绑定的端口一定要和发送的端口保持一致
        */
        DatagramSocket ds = new DatagramSocket(10086);

        //2.接受打包好的数据
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        //该方法是阻塞的,程序执行到这里时会在这里等待发送端发送消息
        ds.receive(dp);

        //3.解析数据包
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress inetAddress = dp.getAddress();
        int port = dp.getPort();

        System.out.println("接收到数据:" + new String(data, 0, len));
        System.out.println("该数据是从" + inetAddress + "这台电脑中的" + port + "端口发出的");

        //4.释放资源
        ds.close();
    }
}
