package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class LambdaTraverse {
    public static void main(String[] args) {
        //得益于JDK8开始的新技术Lambda表达式,提供了一种更简单更直接的遍历集合的方式
        //default void forEach(Consumer<? super T> action) 结合Lambda表达式进行集合的遍历

        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        //匿名内部类的形式
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });

        //Lambda表达式形式
        collection.forEach(t -> System.out.println(t));
    }
}
