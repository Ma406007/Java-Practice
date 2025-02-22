package JDK8Time;

//DateTimeFormatter:用于时间的格式化和解析

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaSimpleDateFormatter {
    public static void main(String[] args) {
        //static DateTimeFormatter ofPattern(格式) 获取格式对象
        ZonedDateTime zonedDateTime1 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(formatter.format(zonedDateTime1));

        //String format(时间对象) 按照指定方式格式化
    }
}
