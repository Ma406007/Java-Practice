package JDK7Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat可以用来把时间变成我们喜欢的格式,把字符串表示的时间解析成Date对象

public class JavaSimpleDateFormat {
    public static void main(String[] args) {
        //构造方法
        //public SimpleDateFormat() 构造一个SimpleDateFormat对象,使用默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date date1 = new Date(0L);
        String str1 = sdf1.format(date1);
        System.out.println(str1);

        //public SimpleDateFormat(String pattern) 构造一个SimpleDateFormat对象,使用指定的格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date2 = new Date(0L);
        String str2 = sdf2.format(date2);
        System.out.println(str2);

        //成员方法
        //public final String format(Date date) 格式化(日期对象->字符串)
        //public Date parse(String source) 解析(字符串->日期对象),创建对象的格式要跟字符串的格式保持一致
        String str3 = "2023-11-11 11:11:11";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date3 = new Date(0L);
        try {
            date3 = sdf3.parse(str3);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(date3);
    }
}
