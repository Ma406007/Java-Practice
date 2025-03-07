package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadTest05 {
    /*
      有一个抽奖池,抽奖池种存放了奖励的金额,该抽奖池种的奖项为{10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700}
      创建两个抽奖箱(线程)并设置线程名称分别为"抽奖箱1"和"抽奖箱2"
      随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
        每次抽出一个奖项就随机打印一个(随机)
        抽奖箱1产生了一个10元大奖
        抽奖箱1产生了一个100元大奖
        抽奖箱1产生了一个200元大奖
        抽奖箱1产生了一个800元大奖
        抽奖箱2产生了一个700元大奖
        ...
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        Lottery1 lottery1 = new Lottery1(list);
        Lottery1 lottery2 = new Lottery1(list);

        lottery1.setName("抽奖箱1");
        lottery2.setName("抽奖箱2");

        lottery1.start();
        lottery2.start();
    }
}

class Lottery1 extends Thread {
    ArrayList<Integer> list;

    public Lottery1(ArrayList<Integer> list) {
        this.list = list;
    }

    //线程一
    static ArrayList<Integer> list1 = new ArrayList<>();
    //线程二
    static ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        while (true) {
            synchronized (Lottery2Case01.class) {
                if (list.isEmpty()) {
                    break;
                } else {
                    //继续抽奖
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + "产生了一个" + prize + "元大奖");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}