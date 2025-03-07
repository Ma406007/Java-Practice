package MultiThreading;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest04 {
    /*
      抢红包也用到了多线程
      假设:100块,分成了三个包,现在有5个人去抢
      其中红包是共享数据
      5个人是5条线程
      打印结果如下:
        XXX抢到了XXX元
        XXX抢到了XXX元
        XXX抢到了XXX元
        XXX没抢到
        XXX没抢到
    */

    public static void main(String[] args) {
        people2 people1 = new people2();
        people2 people2 = new people2();
        people2 people3 = new people2();
        people2 people4 = new people2();
        people2 people5 = new people2();

        people1.setName("线程1");
        people2.setName("线程2");
        people3.setName("线程3");
        people4.setName("线程4");
        people5.setName("线程5");

        people1.start();
        people2.start();
        people3.start();
        people4.start();
        people5.start();
    }
}

class people2 extends Thread {
    //红包总金额total被分成count份
    static int count = 3;
    static BigDecimal money = BigDecimal.valueOf(100.0);

    //最小中奖金额
    static final BigDecimal MIN = BigDecimal.valueOf(0.01);

    @Override
    public void run() {
        synchronized (people2.class) {
            if (count == 0) {
                System.out.println(Thread.currentThread().getName() + "没有抢到红包");
            }
            else {
                //prize为中奖金额
                BigDecimal prize;
                if (count == 1) {
                    //此时是最后一个红包,不需要再进行随机数分金额
                    prize = money;
                }
                else {
                    //第一次和第二次抢红包需要随机
                    Random random = new Random();
                    //第一次和第二次金额的范围
                    double bounds = money.subtract(BigDecimal.valueOf(count - 1).multiply(MIN)).doubleValue();
                    prize = BigDecimal.valueOf(random.nextDouble(bounds));
                    //prize有可能小于MIN,因此如果小于MIN要强制将其变成MIN
                }
                prize = prize.setScale(2, RoundingMode.HALF_UP);
                System.out.println(Thread.currentThread().getName() + "抢到了" + prize + "元");
                money = money.subtract(prize);
                count--;
            }
        }
    }
}
