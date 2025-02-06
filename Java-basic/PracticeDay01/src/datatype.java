public class datatype {
    public static void main(String[] args) {
        // 整数
        // byte 范围:-128~127 大小:1字节
        byte b = 10;
        System.out.println(b);

        // short 范围:-32768~32767 大小:2字节
        short s = 20;
        System.out.println(s);

        // int(默认) 范围:-2147483648~2147483647 大小:4字节
        int i = 30;
        System.out.println(i);

        // long 范围:-9223372036854775808~9223372036854775807 大小:8字节
        // 如果要定义long类型的变量,需要在值的后面加上L或l作为后缀
        long l = 9999999999L;
        System.out.println(l);

        // 浮点数
        // float 范围:-3.401298e-38~3.402823e+38 大小:4字节
        // 如果要定义float类型的变量,需要在值的后面加上F或f作为后缀
        float f = 10.1F;
        System.out.println(f);

        // double(默认) 范围:-4.9000000e-324~1.797693e+308 大小:8字节
        double d = 20.2;
        System.out.println(d);

        // 字符
        // char 范围:0~65535 大小:2字节
        char c = 'a';
        System.out.println(c);

        // 布尔
        // boolean 取值:true/false 大小:1字节
        boolean o=true;
        System.out.println(o);
    }
}
