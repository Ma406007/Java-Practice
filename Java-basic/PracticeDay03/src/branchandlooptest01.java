public class branchandlooptest01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
            else  {
                int tmp = i;
                while(tmp != 0) {
                    if (tmp % 10 == 7) {
                        System.out.println(i);
                    }
                    tmp /= 10;
                }
            }
        }
    }
}
