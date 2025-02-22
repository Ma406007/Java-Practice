package JDK7Time;

//Calendar表示系统当前时间的日历对象,可以单独修改和获取时间中的年月日
//Calendar是个抽象类,不能直接创建对象

import java.util.Calendar;

public class JavaCalendar {
    public static void main(String[] args) {
        //获取日历对象的方法
        //public static Calendar getInstance() 获取当前时间的日历对象
        //月份范围0~11,对应现实的月份需要+1
        //星期:1(天) 2(一) 3(二) 4(三) 5(四) 6(五) 7(六)
        //其数据共有17个,存在数组里,需要时访问下标获取相应的元素即可
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //成员方法
        //public final Date getTime() 获取日期对象
        //public final setTime(Date date) 给日历设置日期对象
        //public long getTimeInMillis() 拿到时间毫秒值
        //public void setTimeInMillis(long millis) 给日历设置时间毫秒值
        //public int get(int field) 取日历中的某个字段信息
        //public void set(int field, int value) 修改日历中的某个字段信息
        //public void add(int field, int amount) 为某个字段增加/减少指定的值
    }
}
