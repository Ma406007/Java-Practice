package IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NonSerializedStream {
    //反序列化流/对象操作输入流:可以把被序列化到本地文件中的对象读取到程序中来
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //构造方法:
        //public ObjectInputStream(InputStream out) 把基本流变成高级流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("PracticeDay24\\student.txt"));

        //成员方法
        //public Object readObject() 把序列化到本地文件中的对象读取到程序中来
        Object o = ois.readObject();

        System.out.println(o);
        ois.close();
    }

    //序列化流/反序列化流的细节汇总:
    //1.使用序列化流将对象写到文件时,需要让JavaBean类实现Serializable接口,否则会出现NotSerializableException异常
    //2.序列化流写到文件中的数据是不能修改的,一旦修改就无法再次读回来了
    //3.序列化对象后,修改了JavaBean类,再次反序列化会抛出InvalidClassException异常,解决方案:给JavaBean类添加serialVersionUID(序列号,版本号)
    //4.如果一个对象中的某个成员变量的值不想被序列化,可以给该成员变量加transient关键字进行修饰,被该关键字标记的成员变量不会参与序列化过程
}
