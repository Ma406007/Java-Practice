package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedStream {
    //序列化流/对象操作输出流:可以把Java中的对象写到本地文件中
    public static void main(String[] args) throws IOException {
        //构造方法:
        //public ObjectOutputStream(OutputStream out) 把基本流包装成高级流
        Student student1 = new Student("张三", 23, "qingdao");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("PracticeDay24\\Student.txt"));

        //成员方法:
        //细节:使用对象输出流将对象保存到文件时会出现NotSerializableException异常
        //解决方案:让JavaBean类实现Serializable接口
        //public final void writeObject(Object obj) 把对象序列化(写出)到文件中去
        oos.writeObject(student1);

        oos.close();
    }
}