package Crawler;

//Java爬虫爬取主要使用正则表达式的字符串匹配进行爬取
//网络爬虫Java不作重点,原理和Python类似

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    /*有如下文本,请按照要求爬取数据
      Java自从95年问世以来,经历了很多版本,目前企业中用的最多的是Java8和Java11,
      因为这两个是长期支持版本,下一长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台
      要求:找出里面所有的JavaXX
    */

    public static void main(String[] args) {
        String str = "Java自从95年问世以来,经历了很多版本,目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本,下一长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

        //Pattern:表示正则表达式
        //Matcher:表示文本匹配器,按照正则表达式的规则去读取字符串,从头开始读取

        method1(str);
    }

    public static void method1(String str) {
        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");

        //获取文本匹配器的对象
        //m:文本匹配器的对象
        //str:大串
        //p:规则
        //m要在str中寻找符合p规则的子串
        Matcher m = p.matcher(str);

        //拿着文本匹配器从头开始读取,寻找是否有满足规则的子串
        //如果没有,返回false
        //如果有,返回true,并在底层记录子串的起始索引和结束索引+1
        while (m.find()) {
            //方法底层会根据find()方法记录的索引进行字符串的截取
            //与subString(起始索引, 结束索引)一样,包头不包尾
            //返回符合条件的子串
            String s = m.group();

            System.out.println(s);
        }
    }
}
