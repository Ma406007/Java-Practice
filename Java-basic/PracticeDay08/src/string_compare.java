import java.util.Scanner;

public class string_compare {
    public static void main(String[] args) {
        //基础数据类型比较的是数据值
        int a = 10;
        int b = 20;
        System.out.println(a == b);

        //引用数据类型比较的是地址值
        String a1 = new String("abc");
        String a2 = new String("abc");
        System.out.println(a1 == a2);//false

        //直接赋值会查找串池中是否存在
        String str1 = "abc";
        String str2 = "abc";//复用
        System.out.println(str1 == str2);//true

        String str3 = "abc";
        String str4 = new String("abc");
        System.out.println(str3 == str4);//false

        //防止发生数据值和地址值的比较,利用.equals()方法
        String str5 = "abc";
        String str6 = new String("abc");
        System.out.println(str5.equals(str6));//true

        //.equalsIgnoreCase()忽略大小写
        String str7 = "abc";
        String str8 = new String("ABC");
        System.out.println(str7.equalsIgnoreCase(str8));//true

        //如果键盘录入再用==进行比较结果依然是false
        Scanner sc = new Scanner(System.in);
        String str9 = sc.nextLine();//本质是new出来的
        String str10 = "abc";
        System.out.println(str9 == str10);//false
    }
}
