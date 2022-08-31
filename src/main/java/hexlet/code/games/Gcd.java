package hexlet.code.games;

import java.util.Random;

public class Gcd {
    static final int BOUNDFORNUMBERS = 100;
    public static String[][] gcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        final int questions = 3;
        String[][] pair = new String[questions][2];
        for (var i = 0; i < questions; i++) {
            int right;
            int randomNum1 = random.nextInt(BOUNDFORNUMBERS);
            int randomNum2 = random.nextInt(BOUNDFORNUMBERS);
            pair[i][0] = "Question: " + randomNum1 + " " + randomNum2;
            if (randomNum1 == 0 || randomNum2 == 0) {
                right = Math.max(randomNum1, randomNum2);
            } else {
                right = Math.min(randomNum1, randomNum2);
                for (var k = right; k >= 1; k--) {
                    if (randomNum1 % k == 0 && randomNum2 % k == 0) {
                        right = k;
                        break;
                    }
                }
            }
            pair[i][1] = String.valueOf(right);
        }
        return pair;
    }
}
