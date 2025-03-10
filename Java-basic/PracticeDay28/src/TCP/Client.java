package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    /*
      TCP通信协议是一种可靠的网络协议,它在通信的两端各建立一个Socket对象
      通信之前要保证连接已经建立
      通过Socket产生IO流来进行网络通信
    */
    public static void main(String[] args) throws IOException {
        //1.创建客户端的Socket对象(Socket)与指定服务端连接
        Socket socket = new Socket("LAPTOP-6N8RGT4K", 10000);

        //2.获取输出流,写数据
        OutputStream os = socket.getOutputStream();
        os.write("你好你好".getBytes());

        //3.释放资源
        os.close();
        socket.close();
    }
}
