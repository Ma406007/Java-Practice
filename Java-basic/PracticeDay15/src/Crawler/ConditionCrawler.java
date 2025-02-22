package Crawler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConditionCrawler {
    /*有如下文本,请按照要求爬取数据
      Java自从95年问世以来,经历了很多版本,目前企业中用的最多的是Java8和Java11,
      因为这两个是长期支持版本,下一长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台
      需求1:爬取版本号为8,11,17的Java文本,但是只要Java,不显示版本号
      需求2:爬取版本号为8,11,17的Java文本
      需求3:爬取除了版本号为8,11,17的Java文本
    */

    public static void main(String[] args) {
        String str = "Java自从95年问世以来,经历了很多版本,目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本,下一长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

        System.out.println("需求1:");
        method1(str);
        System.out.println();

        System.out.println("需求2:");
        method2(str);
        System.out.println();

        System.out.println("需求3:");
        method3(str);
        System.out.println();
    }

    public static void method1(String str) {
        //Pattern p = Pattern.compile("Java(?=8|11|17)");
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);

        while (m.find()) {
            String s = m.group();
            if (s.length() == 5) {
                if (s.substring(4).equals("8")) {
                    System.out.print(s.substring(0, 4) + " ");
                }
            }
            else if (s.length() == 6) {
                if ((s.substring(4, 6).equals("11")) || (s.substring(4, 6).equals("17"))) {
                    System.out.print(s.substring(0, 4) + " ");
                }
            }
        }
    }

    public static void method2(String str) {
        //Pattern p = Pattern.compile("Java(8|11|17)");
        //Pattern p = Pattern.compile("Java(?:8|11|17)");
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);

        while (m.find()) {
            String s = m.group();
            if (s.length() == 5) {
                if (s.substring(4).equals("8")) {
                    System.out.print(s + " ");
                }
            }
            else if (s.length() == 6) {
                if ((s.substring(4, 6).equals("11")) || (s.substring(4, 6).equals("17"))) {
                    System.out.print(s + " ");
                }
            }
        }
    }

    public static void method3(String str) {
        //Pattern p = Pattern.compile("Java(?!8|11|17)");
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);

        while (m.find()) {
            String s = m.group();
            if (s.length() == 4) {
                System.out.println(s);
            }
        }
    }
}
