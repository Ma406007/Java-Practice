package Landlords;

import com.sun.jdi.ArrayReference;

import java.util.*;

public class PokerGame {
    //牌盒
    static ArrayList<Integer> list = new ArrayList<>();

    //排序
    static HashMap<Integer, String> map = new HashMap<>();

    //三家手牌
    static TreeSet<Integer> player1 = new TreeSet<>();
    static TreeSet<Integer> player2 = new TreeSet<>();
    static TreeSet<Integer> player3 = new TreeSet<>();
    //地主牌
    static TreeSet<Integer> lord = new TreeSet<>();

    //准备牌
    static {
        //"♦" "♣" "♥" "♠"
        String[] color = {"♦", "♣", "♥", "♠"};
        //3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A, 2
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int count = 1;
        for (String string : number) {
            for (String s : color) {
                list.add(count);
                map.put(count++, s + string);
            }
        }
        list.add(count);
        map.put(count++, "小王");
        list.add(count);
        map.put(count, "大王");
    }

    public PokerGame() {
        //洗牌
        Collections.shuffle(list);

        System.out.println(map);

        //发牌
        while (list.size() > 3) {
            player1.add(list.remove(0));
            player2.add(list.remove(0));
            player3.add(list.remove(0));
        }

        lord.add(list.remove(0));
        lord.add(list.remove(0));
        lord.add(list.remove(0));

        //看牌
        lookPoker("zhangsan", player1);
        lookPoker("lisi", player2);
        lookPoker("wangwu", player3);
        lookPoker("地主牌", lord);
    }

    public static void lookPoker(String name, TreeSet<Integer> list) {
        System.out.println(name + ":");
        for (Integer s : list) {
            System.out.print(map.get(s) + " ");
        }
        System.out.println();
    }
}