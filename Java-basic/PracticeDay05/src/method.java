public class method {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int sum = add(a, b, c);
        System.out.println(sum);
    }

    public static int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
}
