public class logic_operators {
    public static void main(String[] args) {
        // 1.&
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(false & false);

        // 2.|
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        // 3.^
        System.out.println(true ^ true);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);

        // 4.!
        System.out.println(!true);
        System.out.println(!false);

        // 5.&&
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);

        // 6.||
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);
    }
}
