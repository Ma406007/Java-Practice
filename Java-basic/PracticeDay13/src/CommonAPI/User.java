package CommonAPI;

//class for clone test

import java.util.StringJoiner;

//Cloneable
//如果一个接口里面没有抽象方法
//表示当前接口是一个标记性接口
//现在Cloneable表示一旦实现,那么当前类的对象就可以被拷贝
//如果没有实现就不能拷贝

//浅拷贝:基本数据类型直接拷贝,引用数据类型共用同一块内存空间
//深拷贝:基本数据类型直接拷贝,引用数据类型会重新开辟一块内存空间然后拷贝内容,String会直接复用

public class User implements Cloneable {
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {}
    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public int[] getData() {
        return data;
    }
    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "角色编号:" + id + ", 用户名:" +  username + ", 密码:" + password + ", 游戏图片:" + path + ", 进度:" + arrToString();
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone()方法
        //相当于让Java帮我们克隆一个对象并返回
        return super.clone();
    }
}
