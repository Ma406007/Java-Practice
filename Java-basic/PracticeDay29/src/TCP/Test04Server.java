package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Test04Server {
    /*
      TCP通信练习4 --- 上传文件(文件名重复问题)
      解决上一题文件名重复问题
    */

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();

        UUID uid = UUID.randomUUID();
        String fileName = uid.toString().replace("-", "") + ".zip";
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\tmp\\" + fileName));
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
