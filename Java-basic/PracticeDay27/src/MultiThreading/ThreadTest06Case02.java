package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadTest06Case02 {
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

        Lottery2Case02 lottery1 = new Lottery2Case02(list);
        Lottery2Case02 lottery2 = new Lottery2Case02(list);

        lottery1.setName("抽奖箱1");
        lottery2.setName("抽奖箱2");

        lottery1.start();
        lottery2.start();
    }
}

class Lottery2Case02 extends Thread {
    ArrayList<Integer> list;

    public Lottery2Case02(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //每个线程都会有自己独立的栈空间,互不影响
        //因此线程1和线程2都会有自己的集合
        ArrayList<Integer> boxList = new ArrayList<>();
        int max = 0;
        while (true) {
            synchronized (Lottery2Case02.class) {
                if (list.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + boxList + "最大金额为" + max);
                    break;
                } else {
                    //继续抽奖
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    if (prize > max) {
                        max = prize;
                    }
                    boxList.add(prize);
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