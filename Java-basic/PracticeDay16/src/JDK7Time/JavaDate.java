package JDK7Time;

import java.util.Date;

//JDK7以前的时间相关类
//Date 时间
//SimpleDateFormat 格式化时间
//Calendar 日历

public class JavaDate {
    //Date类是一个JDK写好的JavaBean类,用来描述时间,单位精确到毫秒
    //利用空参构造创建的对象,默认表示系统当前时间
    //利用有参构造创建的对象,表示指定的时间

    public static void main(String[] args) {
        //public Date() 创建Date对象,表示当前时间
        Date date1 = new Date();
        System.out.println(date1);

        //public Date(long time) 创建Date对象,表示指定时间
        Date date2 = new Date(0L);
        System.out.println(date2);

        //public void setTime(long time) 设置/修改毫秒值
        date2.setTime(1000L);
        System.out.println(date2);

        //public long getTime() 获取时间对象的毫秒值,可用于比较两个Date的前后关系
        long time =  date2.getTime();
        System.out.println(time);
    }
}
