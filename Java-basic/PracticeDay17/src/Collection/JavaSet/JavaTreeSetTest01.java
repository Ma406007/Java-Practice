package Collection.JavaSet;

import java.util.TreeSet;

//TreeSet集合默认的排序规则
//对于数值类型:Integer,Double等都默认按照从小到大的顺序进行排序
//对于字符和字符串类型:按照字符在ASCII码表中的数字升序进行排序
//对于自定义类型:
//第一种是默认排序/自然排序:JavaBean类实现Comparable接口指定比较规则(优先使用,如果第一种无效再使用第二种)
//第二种是比较器排序:创建TreeSet对象时,传递比较器Comparator指定规则
//当第一种和第二种同时存在时会优先调用第二种排序规则

public class JavaTreeSetTest01 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 21);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 23);
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);

        System.out.println(treeSet);
    }
}
