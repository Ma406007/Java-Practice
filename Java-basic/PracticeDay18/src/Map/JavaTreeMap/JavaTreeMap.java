package Map.JavaTreeMap;

//TreeMap特点
//1.TreeMap和TreeSet底层原理一样,都是红黑树结构
//2.由键决定特性:不重复,无索引,可排序(对键进行排序,默认按照键的从小到大进行排序,也可以自己规定键的排序规则)

//自定义排序规则有两种方法
//1.实现Comparable接口,指定比较规则
//2.创建集合时传递Comparator比较器对象,指定比较规则
//其他特性和原理均与TreeSet一致

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class JavaTreeMap {
    /*
      需求1:
      键:整数,表示id
      值:字符串表示商品名称
      要求:按照id的升序排列,按照id的降序排列

      需求2:
      键:学生对象
      值:籍贯
      要求:按照学生年龄的升序排序,年龄一样按照姓名的字母排序,同姓名年龄视为一个人
    */
    public static void main(String[] args) {
        TreeMap<Good, Integer> treeMap1 = new TreeMap<>();
        Good g1 = new Good(1, "Xiaomi15");
        Good g2 = new Good(2, "iPhone16");
        Good g3 = new Good(3, "HUAWEI Mate70");

        treeMap1.put(g1, 0);
        treeMap1.put(g2, 0);
        treeMap1.put(g3, 0);

        Set<Good> set1 = treeMap1.keySet();
        for (Good good : set1) {
            System.out.println(good.getId() + "." + good.getName());
        }

        System.out.println();

        TreeMap<Student, Integer>  treeMap2 = new TreeMap<>();
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 25);

        treeMap2.put(s1, 0);
        treeMap2.put(s2, 0);
        treeMap2.put(s3, 0);

        Set<Student> set2 = treeMap2.keySet();
        for (Student student : set2) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}

class Good implements Comparable<Good> {
    private int id;
    private String name;

    public Good() {}
    public Good(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Good o) {
        //根据id升序
        return this.getId() - o.getId();

        //根据id降序
        //return o.getId() - this.getId();
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {}
    public Student(String name, int age) {
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

    @Override
    public int compareTo(Student o) {
        int result = this.getAge() - o.getAge();
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        return result;
    }
}
