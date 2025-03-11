package TCP;

import java.io.*;
import java.net.Socket;

public class Test04Client {
    /*
      TCP通信练习4 --- 上传文件(文件名重复问题)
      解决上一题文件名重复问题
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
