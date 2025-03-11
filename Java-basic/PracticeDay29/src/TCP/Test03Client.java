package TCP;

import java.io.*;
import java.net.Socket;

public class Test03Client {
    /*
      TCP通信练习3 --- 上传文件
      客户端:将本地文件上传到服务器,接收服务器的反馈
      服务器:接收客户端上传的文件,上传完毕后给出反馈
    */

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("LAPTOP-6N8RGT4K", 10000);

        //读取本地文件的数据,并写到服务器中
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\All the Mods 9-1.0.4.zip"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] buf = new byte[1024];
        int len;
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }

        bos.flush();

        //结束标记
        socket.shutdownOutput();

        //接收服务器的回写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);

        socket.close();
    }
}
