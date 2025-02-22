package JDK8Time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

//ZoneId:时区
//Instant:时间戳
//ZoneDateTime:带时区的时间

public class JavaDate {
    public static void main(String[] args) {
        //ZoneId:
        //static Set<String> getAvailableZoneIds() 获取Java中支持的所有时区
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //static ZoneId systemDefault() 获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //static ZoneId of(String zoneId) 获取一个指定时区
        System.out.println();

        //Instant:
        //static Instant now() 获取当前时间的Instant对象(标准时间)
        Instant now = Instant.now();
        System.out.println(now);

        //static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant = Instant.ofEpochMilli(0L);
        System.out.println(instant);

        //ZonedDateTime atZone(ZoneId zone) 指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //boolean isXxx(Instant otherInstant) 判断系列的方法
        Instant instant2 = Instant.ofEpochMilli(0L);
        Instant instant3 = Instant.ofEpochMilli(1000L);
        boolean result = instant2.isBefore(instant3);
        System.out.println(result);

        //Instant minusXxx(long millisToSubtract) 减少时间系列的方法
        //Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        System.out.println();

        //ZonedDateTime:
        //static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        //static ZonedDateTime ofXxxx(...) 获取指定时间的ZonedDateTime对象
        //ZonedDateTime withXxx(时间) 修改时间系列的方法
        Instant instant4 = Instant.ofEpochMilli(0L);
        ZoneId zoneId2 = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(instant4, zoneId2);
        System.out.println(zonedDateTime2);

        //ZonedDateTime minusXxx(时间) 减少时间系列的方法
        //ZonedDateTime plusXxx(时间) 增加时间系列的方法
    }
}
