package Crawler;

//正则内部用 \\组号
//正则外部用 $组号

public class CaptureGroup02 {
    /*
      将字符串:我要学学编编编编程程程程程程
      替换为:我要学编程
    */

    public static void main(String[] args) {
        String str = "我要学学编编编编程程程程程程";

        String ans = str.replaceAll("(.)\\1+", "$1");

        System.out.println(ans);
    }
}
