package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test03Server {
    /*
      TCP通信练习3 --- 上传文件
      客户端:将本地文件上传到服务器,接收服务器的反馈
      服务器:接收客户端上传的文件,上传完毕后给出反馈
    */

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\tmp\\All the Mods 9-1.0.4.zip"));
        int len;
        byte[] buf = new byte[1024];
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }

        bos.flush();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        socket.close();
    }
}
