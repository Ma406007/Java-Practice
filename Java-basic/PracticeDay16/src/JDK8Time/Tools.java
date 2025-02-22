package JDK8Time;

//Duration:时间间隔(秒, 纳秒)
//Period:时间间隔(年, 月, 日)
//ChronoUnit:时间间隔(所有单位)

import java.time.LocalDate;
import java.time.Period;

public class Tools {
    public static void main(String[] args) {
        LocalDate today =  LocalDate.now();
        System.out.println(today);

        LocalDate birthDate = LocalDate.of(2005, 3, 10);
        System.out.println(birthDate);

        Period period = Period.between(birthDate, today);

        System.out.println("相差的时间间隔对象:" + period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());
    }
}
