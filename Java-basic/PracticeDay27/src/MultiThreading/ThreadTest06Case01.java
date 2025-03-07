package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadTest06Case01 {
    /*
      在ThreadTest05的基础上继续完成如下需求:
        每次抽的过程中,不打印,抽完时一次性打印(随机)
        在此次抽奖过程中,抽奖箱1总共产生了6个奖项:
          分别为:10, 20, 100, 500, 2, 300最高奖项为500元,总计额为932元
        在此次抽奖过程中,抽奖箱2总共产生了6个奖项
          分别为:5, 50, 200, 800, 80, 700最高奖项为700元,总计额为1835元
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        Lottery2Case01 lottery1 = new Lottery2Case01(list);
        Lottery2Case01 lottery2 = new Lottery2Case01(list);

        lottery1.setName("抽奖箱1");
        lottery2.setName("抽奖箱2");

        lottery1.start();
        lottery2.start();
    }
}

class Lottery2Case01 extends Thread {
    ArrayList<Integer> list;

    public Lottery2Case01(ArrayList<Integer> list) {
        this.list = list;
    }

    //线程一
    static ArrayList<Integer> list1 = new ArrayList<>();
    static int max1 = 0;
    //线程二
    static ArrayList<Integer> list2 = new ArrayList<>();
    static int max2 = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (Lottery2Case01.class) {
                if (list.isEmpty()) {
                    if("抽奖箱1".equals(getName())){
                        System.out.println("抽奖箱1" + list1 + "最大金额为" + max1);
                    }else {
                        System.out.println("抽奖箱2" + list2 + "最大金额为" + max2);
                    }
                    break;
                } else {
                    //继续抽奖
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    if("抽奖箱1".equals(getName())){
                        if (prize > max1) {
                            max1 = prize;
                        }
                        list1.add(prize);
                    }else {
                        if (prize > max2) {
                            max2 = prize;
                        }
                        list2.add(prize);
                    }
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