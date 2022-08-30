package hexlet.code.games;

import java.util.Random;

public class Even {
    public static String[][] even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        final int questions = 3;
        String[][] pair = new String[questions][2];
        for (var i = 0; i < questions; i++) {
            final int boundForNumber = 100;
            int randomNum = random.nextInt(boundForNumber);
            pair[i][0] = "Question: " + randomNum;
            pair[i][1] = randomNum % 2 == 0 ? "yes" : "no";
        }
        return pair;
    }
}
