package StudentSystem;

public class User {
    private String username;
    private String password;
    private String id_number;
    private String phone_number;

    public User() {}
    public User(String username, String password, String id_number, String phone_number) {
        this.username = username;
        this.password = password;
        this.id_number = id_number;
        this.phone_number = phone_number;
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
    public String getId_number() {
        return id_number;
    }
    public void setId_number(String id_number) {
        this.id_number = id_number;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
