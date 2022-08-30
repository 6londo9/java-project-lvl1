package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static String[][] prime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        final int questions = 3;
        String[][] pair = new String[questions][2];
        for (var i = 0; i < questions; i++) {
            final int boundForNumber = 100;
            int randomNum = random.nextInt(boundForNumber);
            boolean check = randomNum != 1 && randomNum != 0;
            for (var k = 2; k <= Math.sqrt(randomNum); k++) {
                if (randomNum % k == 0) {
                    check = false;
                    break;
                }
            }
            pair[i][1] = check ? "yes" : "no";
            pair[i][0] = "Question: " + randomNum;
        }
        return pair;
    }

}
