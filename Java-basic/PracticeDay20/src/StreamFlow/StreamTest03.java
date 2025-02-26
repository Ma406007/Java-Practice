package StreamFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    /*
      现在有两个ArrayList集合
      第一个集合中存储6名男演员的名字和年龄,第二个集合中存储6名女演员的名字和年龄
      姓名和年龄中间用逗号隔开
      要求:
      1.男演员只要名字为3个字的前两人
      2.女演员只要姓杨的,并且不要第一个
      3.把过滤后的男演员姓名和女演员姓名合并到一起
      4.将上一步的演员信息封装成Actor对象
      5.将所有的演员对象都保存到List集合中
      注:演员类Actor,属性:name,age
    */

    public static void main(String[] args) {
        ArrayList<String> actor = new ArrayList<>();
        Collections.addAll(actor, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        ArrayList<String> actress = new ArrayList<>();
        Collections.addAll(actress, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        Stream<String> stream1 = actor.stream().
                filter(name -> name.split(",")[0].length() == 3).
                limit(2);
        Stream<String> stream2 = actress.stream().filter(name -> name.startsWith("杨")).skip(1);

        //法一:
        //匿名内部类
        Stream.concat(stream1, stream2).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name, age);
            }
        }).forEach(s -> System.out.println(s));

        //Lambda表达式
        List<Actor> list = Stream.concat(stream1, stream2).
                map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        //法二:
        //List<Actor> ans = new ArrayList<>();
        //for (String s : list) {
        //    Actor info = new Actor();
        //    info.setName(s.split(",")[0]);
        //    info.setAge(Integer.parseInt(s.split(",")[1]));
        //    ans.add(info);
        //}

        //for (Actor an : ans) {
        //    System.out.print(an.getName() + " " + an.getAge() + " ");
        //}
    }
}

class Actor {
    private String name;
    private int age;

    public Actor() {}
    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
