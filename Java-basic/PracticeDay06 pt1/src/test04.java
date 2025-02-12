import java.util.Random;

public class test04 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        for (int i = 0; i < 6; i++) {
            Random rand = new Random();
            scores[i] = rand.nextInt(100);
        }
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = (sum - max - min) / scores.length - 2;
        System.out.println(sum);
    }
}
