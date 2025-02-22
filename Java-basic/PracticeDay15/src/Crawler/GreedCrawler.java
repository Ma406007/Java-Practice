package Crawler;

//贪婪爬取(Java默认):在数据爬取的过程中尽可能多的获取数据
//非贪婪爬取:在数据爬取的过程中尽可能少的获取数据

//只写+和*表示贪婪匹配
//如果在+ *后面加上?则表示非贪婪爬取
//+? *?

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedCrawler {
    /*有如下文本,请按照要求爬取数据
      Java自从95年问世以来,abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa
      经历了很多版本,目前企业中用的最多的是Java8和Java11,
      因为这两个是长期支持版本,下一长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台
      需求1:按照ab+的方式爬取ab,b尽可能多的获取
      需求2:按照ab+的方式爬取ab,b尽可能少的获取
    */

    public static void main(String[] args) {
        String str = "Java自从95年问世以来,abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "经历了很多版本,目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本,下一长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

        Pattern p1 = Pattern.compile("ab+");
        Matcher m1 = p1.matcher(str);

        while (m1.find()) {
            System.out.println(m1.group());
        }

        Pattern p2 = Pattern.compile("ab+?");
        Matcher m2 = p2.matcher(str);

        while (m2.find()){
            System.out.println(m2.group());
        }
    }
}
