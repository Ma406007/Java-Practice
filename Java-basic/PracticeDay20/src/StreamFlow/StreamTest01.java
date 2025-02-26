package StreamFlow;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest01 {
    /*
      定义一个集合,并添加一些整数1, 2, 3, 4, 5, 6, 7, 8, 9, 10
      过滤奇数,只留下偶数
      并将结果保存起来
    */

    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        Collections.addAll(hashset,  1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = hashset.stream().filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(even);
    }
}
