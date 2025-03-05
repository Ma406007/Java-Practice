package RollCallDevice05;

import java.io.*;
import java.util.*;

public class Test06 {
    /*
      txt文件中事先准备好了一些学生信息,每个学生的信息独占一行
      要求1:每次被点到的学生,再次被点到的概率在原先的基础上降低一半
      提示:本题的核心就是带权重的随机
    */

    public  static void main(String[] args) throws IOException {
        ArrayList<Student> List = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("PracticeDay25\\src\\RollCallDevice05\\names.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            Student student = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
            List.add(student);
        }

        double totalWeight = 0;
        for (Student student : List) {
            totalWeight += student.getWeight();
        }

        double[] weights = new double[List.size()];
        int index = 0;
        for (Student student : List) {
            weights[index++] = student.getWeight() /  totalWeight;
        }

        for (int i = 1; i < weights.length; i++) {
            weights[i] = weights[i] + weights[i - 1];
        }

        double number = Math.random();
        int result = -Arrays.binarySearch(weights, number) - 1;

        Student student = List.get(result);
        student.setWeight(student.getWeight() / 2);

        BufferedWriter bw = new BufferedWriter(new FileWriter("PracticeDay25\\src\\RollCallDevice05\\names.txt"));
        for (Student stu : List) {
            bw.write(stu.toString());
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}

class Student {
    private String name;
    private String gender;
    private int age;
    private double weight;

    public Student() {}
    public Student(String name, String gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "-" + gender + "-" + age + "-" + weight;
    }
}
