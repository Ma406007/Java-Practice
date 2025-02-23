package Lambda;

import java.util.Comparator;
import java.util.Arrays;

public class Lambda {
    //Lambda表达式的标准格式(JDK8后)
    /*
      () -> {
        方法体
      }
    */
    //() 对应着方法的形参
    //-> 固定格式
    //{} 对应着方法的方法体

    //注意事项
    //Lambda表达式可以用来简化匿名内部类的书写
    //Lambda表达式只能简化函数式接口的匿名内部类的写法
    //函数式接口:有且仅有一个抽象方法的接口叫做函数式接口,接口上方可以加@FunctionalInterface注解
    public static void main(String[] args) {
        //以前的写法
        //匿名内部类的方法重写
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("swimming");
            }
        });

        //Lambda表达式的完整格式
        method(
                () -> {
                    System.out.println("swimming");
                }
        );

        //以前的写法
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        //Lambda表达式的简略写法(省略核心:可推导,可省略)
        //1.参数类型可以省略不写
        //2.如果使用Lambda表达式的某函数只有一个参数,参数类型可以省略,同时()也可以省略
        //3.如果Lambda表达式的方法体只有一行,大括号,分号,return可以省略不写,但是要同时省略
        Arrays.sort(arr, (o1, o2) -> o1 - o2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void method(Swim s) {
        s.swimming();
    }
}

@FunctionalInterface
interface Swim {
    public abstract void swimming();
}
