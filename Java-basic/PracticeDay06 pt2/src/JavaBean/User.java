package JavaBean;

//标准的JavaBean
//1.类名要见名知意
//2.成员变量使用private修饰
//3.提供至少两个构造方法
//4.提供每一个成员变量对应的set和get方法
//5.如果还有其他行为，也需要写上


public class User {
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    public User() {}
    public User(String username, String password, String email, String gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }
    //快速生成get和set方法
    //alt + insert
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
}
