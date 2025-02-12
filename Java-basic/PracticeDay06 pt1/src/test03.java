import java.util.Random;

public class test03 {
    public static void main(String[] args) {
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
        System.out.println(result + num);
    }
}
