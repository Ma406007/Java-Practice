package UDP;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        //UDP通信程序(发送数据)
        //1.创建发送端的DatagramSocket对象
        /*
          细节:
            绑定端口,以后就是通过这个端口向外发送数据
            空参:所有可用的端口中任选一个进行使用
            有参:指定端口号进行绑定
        */
        DatagramSocket ds = new DatagramSocket();

        //2.数据打包(DataGramPacket)
        String str = "计算机408资料";//待发送数据
        byte[] buf = str.getBytes();//将待发送数据变为字节数组
        InetAddress address = InetAddress.getByName("LAPTOP-6N8RGT4K");//发送目的地
        int port = 10086;//发送目的地端口

        DatagramPacket dp = new DatagramPacket(buf, buf.length, address, port);

        //3.发送数据
        ds.send(dp);

        //4.释放资源
        ds.close();
    }
}
