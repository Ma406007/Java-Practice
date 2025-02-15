package StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();


        String username = "";
        String password1 = "";
        String password2 = "";
        String id_number = "";
        String phone_number = "";
        String code = "";

        ArrayList<Student> students = new ArrayList<Student>();
        String id = "";
        String name = "";
        int age = 0;
        String address = "";

        boolean flag = false;

        Scanner sc = new Scanner(System.in);

        while (!flag) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");

            int choice1 =  sc.nextInt();
            switch (choice1) {
                case 1:
                    if (users.isEmpty()) {
                        System.out.println("请先注册用户");
                        continue;
                    }
                    System.out.println("请输入用户名");
                    username = sc.next();
                    if (!checkUsername(users, username)) {
                        System.out.println("该用户不存在!");
                        continue;
                    }

                    System.out.println("请输入密码");
                    password1 = sc.next();
                    int index1 = -1;
                    for (int i = 0; i < users.size(); i++) {
                        if (users.get(i).getUsername().equals(username)) {
                            index1 = i;
                        }
                    }
                    while (!password1.equals(users.get(index1).getPassword())) {
                        System.out.println("密码输入有误,请重新输入");
                        password1 = sc.next();
                    }
                    //到这密码肯定是输入正确了,只有输错密码才会进入循环一直输入,直到输对为止
                    String ChangeCode = getCode();
                    System.out.println("请输入验证码:" + ChangeCode);
                    code = sc.next();
                    if (code.equals(ChangeCode)) {
                        System.out.println("登陆成功!");
                        break;
                    }

                case 2:
                    //用户列表为空
                    if (users.isEmpty()) {
                        System.out.println("请输入用户名");
                        username = sc.next();
                        while (!checkUsernameFormat(username)) {
                            System.out.println("用户名格式有误,请重新输入");
                            username = sc.next();
                        }

                        System.out.println("请输入密码");
                        password1 = sc.next();
                        System.out.println("请再次输入密码");
                        password2 = sc.next();
                        while (!password1.equals(password2)) {
                            System.out.println("两次密码不一致,请重新输入");
                            System.out.println("请输入密码");
                            password1 = sc.next();
                            System.out.println("请再次输入密码");
                            password2 = sc.next();
                        }

                        System.out.println("请输入身份证号");
                        id_number = sc.next();
                        while (!checkId_numberFormat(id_number)) {
                            System.out.println("身份证号输入有误,请重新输入");
                            id_number = sc.next();
                        }

                        System.out.println("请输入手机号");
                        phone_number = sc.next();
                        while (!checkPhone_numberFormat(phone_number)) {
                            System.out.println("手机号输入有误,请重新输入");
                            phone_number = sc.next();
                        }

                        User user = new User(username, password1, id_number, phone_number);
                        users.add(user);
                        System.out.println("注册成功");
                        continue;
                    }

                    //用户列表为空
                    System.out.println("请输入用户名");
                    username = sc.next();
                    while (!checkUsername(users, username)) {
                        if (checkUsernameFormat(username)) {
                            System.out.println("用户名格式有误,请重新输入");
                            username = sc.next();
                        }
                        System.out.println("用户名已存在,请重新输入");
                        username = sc.next();
                    }

                    System.out.println("请输入密码");
                    password1 = sc.next();
                    System.out.println("请再次输入密码");
                    password2 = sc.next();
                    while (!password1.equals(password2)) {
                        System.out.println("两次密码不一致,请重新输入");
                        System.out.println("请输入密码");
                        password1 = sc.next();
                        System.out.println("请再次输入密码");
                        password2 = sc.next();
                    }

                    System.out.println("请输入身份证号");
                    id_number = sc.next();
                    while (!checkId_numberFormat(id_number)) {
                        System.out.println("身份证号输入有误,请重新输入");
                        id_number = sc.next();
                    }

                    System.out.println("请输入手机号");
                    phone_number = sc.next();
                    while (!checkPhone_numberFormat(phone_number)) {
                        System.out.println("手机号输入有误,请重新输入");
                        phone_number = sc.next();
                    }

                    User user = new User(username, password1, id_number, phone_number);
                    users.add(user);
                    System.out.println("注册成功");
                    continue;

                case 3:
                    if (users.isEmpty()) {
                        System.out.println("请先注册用户");
                        continue;
                    }

                    System.out.println("请输入用户名");
                    username = sc.next();
                    while (!checkUsername(users, username)) {
                        System.out.println("该用户名不存在,请重新输入");
                        username = sc.next();
                    }

                    System.out.println("请输入身份证号");
                    id_number = sc.next();
                    while (!checkId_numberFormat(id_number)) {
                        System.out.println("身份证号输入有误,请重新输入");
                        id_number = sc.next();
                    }
                    int index3 = -1;
                    for (int i = 0; i < users.size(); i++) {
                        if (users.get(i).getUsername().equals(username)) {
                            index3 = i;
                        }
                    }
                    while (!id_number.equals(users.get(index3).getId_number())) {
                        System.out.println("身份证号码不一致,请重新输入");
                        id_number = sc.next();
                    }

                    System.out.println("请输入手机号");
                    phone_number = sc.next();
                    while (!checkPhone_numberFormat(phone_number)) {
                        System.out.println("手机号输入有误,请重新输入");
                        phone_number = sc.next();
                    }

                    while (!phone_number.equals(users.get(index3).getPhone_number())) {
                        System.out.println("电话号码不一致,请重新输入");
                        phone_number = sc.next();
                    }

                    System.out.println("请输入新密码");
                    String newpassword = sc.next();
                    users.get(index3).setPassword(newpassword);
                    System.out.println("修改成功!");
                    continue;

                default:
                    System.out.println("输入有误,请重新输入");
            }

            System.out.println("-------------欢迎来到黑马学生管理系统-------------");
            System.out.println("1:添加学生信息");
            System.out.println("2:删除学生信息");
            System.out.println("3:修改学生信息");
            System.out.println("4:查询学生信息");
            System.out.println("5:退出管理系统");
            System.out.println("请输入你的选择:");

            int choice2 = sc.nextInt();
            switch (choice2) {
                //1:添加学生信息
                case 1:
                    System.out.println("请输入要添加的学生的id:");
                    id = sc.next();
                    while (checkStudentId(students, id)) {
                        System.out.println("该id已存在,请重新输入id");
                        id = sc.next();
                    }
                    System.out.println("请输入学生姓名:");
                    name = sc.next();
                    System.out.println("请输入学生年龄:");
                    age = sc.nextInt();
                    System.out.println("请输入学生地址:");
                    address = sc.next();
                    addStudent(students, id, name, age, address);
                    continue;

                    //2:删除学生信息
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("删除失败,当前系统中无学生信息");
                        continue;
                    }

                    System.out.println("请输入要删除的学生的id:");
                    id = sc.next();
                    if (eraseStudent(students, id)) {
                        System.out.println("删除成功");
                    } else {
                        System.out.println("删除失败,id不存在,请重新输入id");
                        id = sc.next();
                    }
                    continue;

                    //3:修改学生信息
                case 3:
                    if (students.isEmpty()) {
                        System.out.println("修改失败,当前系统中无学生信息");
                        continue;
                    }

                    System.out.println("请输入要修改信息的学生的id:");
                    id = sc.next();
                    while (!checkStudentId(students, id)) {
                        System.out.println("该id不存在,请重新输入id");
                        id = sc.next();
                    }
                    System.out.println("请输入学生姓名:");
                    name = sc.next();
                    System.out.println("请输入学生年龄:");
                    age = sc.nextInt();
                    System.out.println("请输入学生地址:");
                    address = sc.next();
                    changeStudent(students, id, name, age, address);
                    System.out.println("修改成功");
                    continue;

                    //4:查询学生信息
                case 4:
                    if (students.isEmpty()) {
                        System.out.println("查询失败,当前系统中无学生信息");
                        continue;
                    }

                    System.out.println("查询成功");
                    queryStudent(students, id);
                    continue;

                    //5:退出管理系统
                case 5:
                    flag = true;
                    break;

                default:
                    System.out.println("输入有误,请重新输入");
            }
        }
    }

    //生成验证码
    public static String getCode() {
        char[] ch = new char[52];
        //1.大写小写都存入数组内部
        for (int i = 0; i < ch.length; i++) {
            if (i <= 25) {
                ch[i] = (char)('a' + i);
            }
            else {
                ch[i] = (char)('A' + i - 26);
            }
        }
        //2.随机取
        String result = "";
        for (int i = 0; i < 4; i++) {
            Random rand = new Random();
            int n = rand.nextInt(ch.length);
            result = result + ch[n];
        }
        Random rand = new Random();
        int num = rand.nextInt(10);
        return result + num;
    }

    //检查手机号格式
    public static boolean checkPhone_numberFormat(String phone_number) {
        //手机号长度必须为11
        if (phone_number.length() != 11) {
            return false;
        }
        //不能以0开头
        if (phone_number.startsWith("0")) {
            return false;
        }
        //必须全是数字
        for (int i = 0; i < phone_number.length(); i++) {
            if (!(phone_number.charAt(i) >= '0' && phone_number.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    //检查身份证号格式
    public static boolean checkId_numberFormat(String id_number) {
        //身份证号长度必须为18
        if (id_number.length() != 18) {
            return false;
        }
        //不能以0开头
        if (id_number.startsWith("0")) {
            return false;
        }
        //前17位必须为数字
        for (int i = 0; i < 16; i++) {
            if (!(id_number.charAt(i) >= '0' && id_number.charAt(i) <= '9')) {
                return false;
            }
        }
        //必须以0~9或大写X或小写x为结尾
        char endChar = id_number.charAt(id_number.length() - 1);
        if ((endChar >= '0' && endChar <= '9') ||  (endChar == 'X') || (endChar == 'x')) {
            return true;
        }
        return false;
    }

    //检查用户名格式
    public static boolean checkUsernameFormat(String username) {
        boolean hasDigit = false;
        boolean hasLetter = false;

        //长度必须在3~15之间
        if (username.length() < 3 ||  username.length() > 15) {
            return false;
        }
        //用户名必须由字母或数字组成
        for(int i = 0; i < username.length(); i++) {
            if (!((username.charAt(i) >= 'A' && username.charAt(i) <= 'Z') || (username.charAt(i) >= 'a' && username.charAt(i) <= 'z') || (username.charAt(i) >= '0' && username.charAt(i) <= '9'))) {
                return false;
            }
        }
        //不能由纯数字组成
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            if ((username.charAt(i) >= 'A' && username.charAt(i) <= 'Z') || (username.charAt(i) >= 'a' && username.charAt(i) <= 'z')) {
                count++;
            }
        }
        return count > 0;
    }

    //检查用户名是否重复
    public static boolean checkUsername(ArrayList<User> users, String username) {
        for (int i  = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    //查询学生信息
    public static void queryStudent(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("id\tname\tage\taddress");
            System.out.println(students.get(i).getId() + "\t" + students.get(i).getName() + " " + students.get(i).getAge() + "\t" + students.get(i).getAddress());
        }
    }

    //修改学生信息
    public static void changeStudent(ArrayList<Student> students, String id, String name, int age, String address) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.get(i).setId(id);
                students.get(i).setName(name);
                students.get(i).setAge(age);
                students.get(i).setAddress(address);
            }
        }
    }

    //删除学生信息
    public static boolean eraseStudent(ArrayList<Student> students, String id) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    //检查学生id是否重复
    public static boolean checkStudentId(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {;
                return true;
            }
        }
        return false;
    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> students, String id, String name, int age, String address) {
        Student student = new Student(id, name, age, address);

        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        students.add(student);
        System.out.println("添加成功");
    }
}
