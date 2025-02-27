package JavaException;

import java.util.Scanner;

public class ExceptionTest {
    /*
      需求:
      键盘录入自己心仪的女朋友姓名和年龄
      姓名的长度在3-10之间
      年龄的范围为18-40岁
      超出这个范围是异常数据不能赋值,需要重新录入,一直录到正确为止
      提示:
      需要考虑用户在键盘录入时的所有情况
      比如:录入年龄时超出范围,录入年龄时录入了abc等情况
    */

    public static void main(String[] args) {
        girlfriend lover = new girlfriend();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("请输入你心仪的女朋友的名字:");
                String name = sc.nextLine();
                lover.setName(name);

                System.out.println("请输入你心仪的女朋友的年龄:");
                String ageStr = sc.nextLine();
                lover.setAge(Integer.parseInt(ageStr));
                break;
            }
            catch (NumberFormatException e) {
                e.printStackTrace();
            }
            catch (NameFormatException e) {
                e.printStackTrace();
            }
            catch (AgeOutOfBoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println(lover.getName() + ":" + lover.getAge());

    }
}

class girlfriend {
    private String name;
    private int age;

    public girlfriend() {}
    public girlfriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() < 3 || name.length() > 10) {
            throw new NameFormatException(name + "格式有误,长度应为3-10");
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age <18 || age > 40) {
            throw new AgeOutOfBoundException(age + "超出了范围");
        }
        this.age = age;
    }
}
