package Collection.JavaSet;

import java.util.TreeSet;

/*
  需求:创建5个学生对象
  属性:姓名,年龄,语文成绩,数学成绩,英语成绩
  按照总分从高到低输出到控制台
  如果总分一样,按照语文成绩排
  如果语文一样,按照数学成绩排
  如果数学一样,按照英语成绩排
  如果英语一样,按照年龄排
  如果年龄一样,按照姓名的字母顺序排
  如果都一样,认为是同一个学生,不存
*/

public class JavaTreeSetTest03 {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo("zhangsan", 23, 90, 99, 50);
        StudentInfo s2 = new StudentInfo("lisi", 24, 90, 98, 50);
        StudentInfo s3 = new StudentInfo("wangwu", 25, 95, 100, 30);
        StudentInfo s4 = new StudentInfo("zhaoliu", 26, 60, 99, 70);
        StudentInfo s5 = new StudentInfo("qianqi", 27, 70, 80, 70);

        TreeSet<StudentInfo> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (StudentInfo t : ts) {
            System.out.println(t.getName() + " " + t.getAge() + " " + t.getChineseScore() + " " + t.getEnglishScore()
                    + " " + t.getMathScore() + " " + t.TotalScore());
        }
    }
}

