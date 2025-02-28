package IOStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTraverse {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("PracticeDay22\\a.txt");

        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char)b);
        }

        fis.close();
    }
}
