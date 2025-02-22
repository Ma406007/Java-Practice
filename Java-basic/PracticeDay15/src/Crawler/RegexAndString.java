package Crawler;

//public String[] matches(String regex) 判断字符串是否满足正则表达式的规则
//public String replaceAll(String regex, String newStr) 按照正则表达式的规则进行替换
//public String[] split(Sting regex) 按照正则表达式对字符串进行切割

public class RegexAndString {
    /*有如下文本,请按照要求爬取数据
      小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
      需求1:把字符串中三个姓名之间的字母替换为vs
      需求2:把三个姓名从字符串中切割出来
    */

    public static void main(String[] args) {
        String str = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";

        String ans1 = str.replaceAll("[\\w&&[^_]]+", "vs");

        System.out.println(ans1);

        String[] ans2 = str.split("[\\w&&[^_]]+");

        for (int i = 0; i < ans2.length; i++) {
            System.out.print(ans2[i] + " ");
        }
    }
}
