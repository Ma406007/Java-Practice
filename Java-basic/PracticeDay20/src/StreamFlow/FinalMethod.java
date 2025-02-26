package StreamFlow;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class FinalMethod {
    public static void main(String[] args) {
        //Stream流的使用步骤:
        //1.先得到一条Stream流(流水线),并把数据放上去
        //2.使用中间方法(Stream流中的各种API)对流水线上的数据进行操作

        //3.使用终结方法(输出,打印)对流水线上的数据进行操作
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //void forEach(Consumer action) 遍历
        arrayList.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();

        //long count() 统计流中的数据个数
        System.out.println(arrayList.stream().count());

        //toArray() 收集流中的数据并放到数组中
        Object[] arr = arrayList.stream().toArray();
        System.out.println(Arrays.toString(arr));
        //匿名内部类
        String[] arr1 = arrayList.stream().toArray(new IntFunction<String[]>() {
            //参数:负责创建一个指定类型的数组
            //底层:依次得到流中的数据并存放到数组中
            //返回值:一个装着流中所有数据的一个数组
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr1));
        //Lambda表达式
        String[] arr2 = arrayList.stream().toArray(n -> new String[n]);
        System.out.println(Arrays.toString(arr2));

        //collect(Collector collector) 收集流中的数据并放到集合中
        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20", "张三丰-男-100",
                "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");
        /* 需求:把男性收集起来并存到List中 */
        arrayList1.stream().filter(s -> "男".equals(s.split("-")[1]))
                //底层收集到ArrayList中
                .collect(Collectors.toList())
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        /* 需求:把男性收集起来并存到Set中 */
        arrayList1.stream().filter(s -> "男".equals(s.split("-")[1]))
                //底层收集到HashSet中
                .collect(Collectors.toSet())
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        /* 需求:把男性收集起来并存到Map中,key:姓名,value:年龄 */
        //匿名内部类
        Map<String, Integer> map = arrayList1.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {//键的生成规则
                    //参数:第一个是流中数据的数据类型,第二个是key的数据类型
                    //返回值:返回key
                    @Override
                    public String apply(String t) {
                        return t.split("-")[0];
                    }
                }, new Function<String, Integer>() {//值的生成规则
                    //参数第一个是流中数据的数据类型,第二个是value的数据类型
                    //返回值:返回value
                    @Override
                    public Integer apply(String t) {
                        return Integer.parseInt(t.split("-")[2]);
                    }
                }));
        System.out.println(map);
        //Lambda表达式
        Map<String, Integer> map1 = arrayList1.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(key -> key.split("-")[0],
                        value -> Integer.parseInt(value.split("-")[2])));
        System.out.println(map1);

    }
}
