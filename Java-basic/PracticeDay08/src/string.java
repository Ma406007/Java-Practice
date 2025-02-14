
public class string {
    public static void main(String[] args) {
        //java.lang.String类代表字符串,java程序中所有的字符串文字(例如"abc")都可以被看作是实现此类的对象
        //字符串定义之后其内容不会发生改变,它的对象在创建后不能被更改

        //创建String对象的两种方式
        //1.直接赋值(推荐使用,节约内存)
        //当使用该方法直接赋值时,系统会检查该字符串在串池中是否存在
        //若存在,则不会在串池中重新创建,而是直接复用
        String str1 = "abc";
        System.out.println(str1);

        //2.new
        //public String() 创建一个空白字符串对象,不含有任何内容
        String str2 = new String();
        System.out.println(str1 + str2);

        //public String(String original) 根据传入的字符串内容,来创建字符串对象
        String str3 = new String("hello");
        System.out.println(str3 + str1);

        //public String(char[] chs) 根据字符数组的内容,来创建字符串对象
        char[] chs = {'h', 'e', 'l', 'l', 'o'};
        String str4 = new String(chs);
        System.out.println(str4 + str1);

        //public String(byte[] bys) 根据字节数组的内容,来创建字符串对象(根据ASCII码表)
        byte[] bys = {97, 98, 99};
        String str5 = new String(bys);
        System.out.println(str2 + str5);

    }
}
