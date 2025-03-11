package TCP;

import java.io.*;
import java.net.Socket;

public class Test05Client {
    /*
      TCP通信练习5 --- 上传文件(多线程版)
      想要服务器不停止,能接收很多用户上传的图片
      提示:可以用循环或者多线程
      但是循环不合理,最优解法是(循环 + 多线程)改写
    */

    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        //1. 创建Socket对象，并连接服务器
        Socket socket = new Socket("LAPTOP-6N8RGT4K",10000);

        //2.读取本地文件中的数据，并写到服务器当中
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\All the Mods 9-1.0.4.zip"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        //往服务器写出结束标记
        socket.shutdownOutput();


        //3.接收服务器的回写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);


        //4.释放资源
        socket.close();

    }
}
