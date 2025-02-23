package Collection.JavaSet;

//LinkedHashSet底层原理
//有序(保证存储和取出的元素顺序一致),不重复,无索引
//底层数据结构依然是哈希表,只是每个元素又额外多了一个双链表的机制记录存储的顺序

import java.util.LinkedHashSet;

public class JavaLinkedHashSet {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);

        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        System.out.println(linkedHashSet.add(s1));
        System.out.println(linkedHashSet.add(s2));
        System.out.println(linkedHashSet.add(s3));
        System.out.println(linkedHashSet.add(s4));

        System.out.println(linkedHashSet);

        //以后要数据去重,默认使用HashSet,HashSet相较于LinkedHashSet效率较高
        //如果要求去重且存储有序才使用LinkedHashSet
    }
}
