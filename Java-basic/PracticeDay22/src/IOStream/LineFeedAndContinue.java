package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class LineFeedAndContinue {
    public static void main(String[] args) throws IOException {
        //续写(默认false)
        FileOutputStream fos = new FileOutputStream("PracticeDay22\\a.txt", true);

        String str1 = "Hello World";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        //换行+回车
        String str2 = "\r\n";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);

        String str3 = "Hello Java";
        byte[] bytes3 = str3.getBytes();
        fos.write(bytes3);

        fos.close();
    }
}
