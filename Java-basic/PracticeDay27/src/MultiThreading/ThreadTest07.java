package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadTest07 {
    /*
      在上一题的基础上继续完成如下需求:
      例如:
        在此次抽奖过程中,抽奖箱1总共产生了6个奖项,分别为:10, 20, 100, 500, 2, 300
          最高奖项为300元,总计额为932元
        在此次抽奖过程中,抽奖箱2总共产生了6个奖项,分别为:5, 50, 200, 800, 80, 700
          最高奖项为800元,总计额为1835元
        在此次抽奖过程中抽奖箱2中产生了最大奖项,该奖项金额为800元
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        Lottery3 lottery1 = new Lottery3(list);
        Lottery3 lottery2 = new Lottery3(list);

        lottery1.setName("抽奖箱1");
        lottery2.setName("抽奖箱2");

        lottery1.start();
        lottery2.start();
    }
}

class Lottery3 extends Thread {
    ArrayList<Integer> list;

    public Lottery3(ArrayList<Integer> list) {
        this.list = list;
    }

    static int max = 0;

    @Override
    public void run() {
        //每个线程都会有自己独立的栈空间,互不影响
        //因此线程1和线程2都会有自己的集合
        ArrayList<Integer> boxList = new ArrayList<>();
        int sum = 0;
        while (true) {
            synchronized (Lottery3.class) {
                if (list.isEmpty()) {
                    Collections.sort(boxList);
                    System.out.println("在此次抽奖过程中," + Thread.currentThread().getName() + "总共产生了"
                            + boxList.size() + "个奖项,分别为:" + boxList + "最高奖项为" + boxList.get(boxList.size() - 1) + "元,总计额为" + sum + "元");
                    break;
                } else {
                    //继续抽奖
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    if (prize > max) {
                        max = prize;
                    }
                    boxList.add(prize);
                    sum += prize;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (boxList.contains(max)) {
            System.out.println("在此次抽奖过程中" + Thread.currentThread().getName() + "中产生了最大奖项,该奖项金额为" + max + "元");
        }
    }
}
