package StreamFlow;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateMethod {
    public static void main(String[] args) {
        //Stream流的使用步骤:
        //1.先得到一条Stream流(流水线),并把数据放上去

        //2.使用中间方法(Stream流中的各种API)对流水线上的数据进行操作
        //注1:中间方法会返回新的Stream流,原来的Stream流只能使用一次,故建议使用链式编程
        //注2:修改Stream流中的数据,不会影响原来集合或者数组中的数据
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //Stream<T> filter(Predicate<? super T> predicate) 过滤
        //匿名内部类
        arrayList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //返回true表示当前数据留下
                //返回false表示当前数据舍弃
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.print(s + " "));
        System.out.println();
        //Lambda表达式(为提高阅读性,每个API之间建议换行)
        arrayList.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        //Stream<T> limit(long maxSize) 获取前几个元素
        arrayList.stream().limit(3)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        //Stream<T> skip(long n) 跳过前几个元素
        arrayList.stream().skip(4)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        //Stream<T> distinct() 元素去重,底层通过HashSet进行元素去重,依赖hashCode()方法和equals()方法,引用数据类型需要重写
        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, "张无忌", "张无忌", "张无忌", "张无忌", "张无忌", "张无忌", "张无忌",
                "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        arrayList1.stream()
                .distinct()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        //static <T> Stream<T> concat(Stream a, Stream b) 合并a和b两个流为一个流
        ArrayList<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, "周芷若", "赵敏");

        Stream.concat(arrayList1.stream(), arrayList2.stream())
                .distinct()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        //Stream<R> map(Function<? super T, ? extends R> mapper) 转换流中的数据类型
        ArrayList<String> arrayList3 = new ArrayList<>();
        Collections.addAll(arrayList3, "张无忌-15", "周芷若-14", "赵敏-13", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37");
        /* 需求:只获取年龄并打印 */
        //匿名内部类
        arrayList3.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String age = arr[1];
                return Integer.parseInt(age);
            }
        }).forEach(s -> System.out.print(s + " "));
        System.out.println();
        //Lambda表达式
        arrayList3.stream().map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.print(s + " "));

        //3.使用终结方法(输出,打印)对流水线上的数据进行操作
    }
}
