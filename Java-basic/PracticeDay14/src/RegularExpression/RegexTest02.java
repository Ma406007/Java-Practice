package RegularExpression;

public class RegexTest02 {
    public static void main(String[] args) {
        //编写正则表达式验证用户名格式(大小写,数字,下划线共4-16位)
        String regex1 = "[a-zA-Z_0-9]{4,16}";

        //编写正则表达式验证身份证号码格式
        String regex2 = "[1-9]\\d{16}[\\dXx]";
    }
}
