import java.util.ArrayList;

public class arraylisttest02 {
    public static void main(String[] args) {
        //基本数据类型对应的包装类
        //byte--Byte
        //short--Short
        //char--Character
        //int--Integer
        //long--Long
        //float--Float
        //double--Double
        //boolean--Boolean

        ArrayList<String> list = new ArrayList<String>();
        Integer count = 1;
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1) {
                System.out.print(count + "." + list.get(i));
            }
            else {
                System.out.print(count + "." + list.get(i) + ", ");
            }
            count++;
        }
        System.out.print("]");
    }
}
