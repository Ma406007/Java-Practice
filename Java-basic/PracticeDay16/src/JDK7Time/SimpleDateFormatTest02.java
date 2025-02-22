package JDK7Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest02 {
    public static void main(String[] args) {
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr1 = "2023年11月11日 0:01:00";
        //String orderStr1 = "2023年11月11日 0:11:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = new Date();
        Date endDate = new Date();
        Date orderDate1 = new Date();

        try {
            startDate = sdf.parse(startStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        try {
            endDate = sdf.parse(endStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        try {
            orderDate1 = sdf.parse(orderStr1);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime1 = orderDate1.getTime();

        if (orderTime1 >= startTime && orderTime1 <= endTime) {
            System.out.println("下单成功");
        }
        else {
            System.out.println("下单失败");
        }
    }
}
