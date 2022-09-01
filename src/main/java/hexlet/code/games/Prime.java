package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public static final int BOUND_FOR_NUMBERS = 100;

    public static String[][] prime() {
        Random random = new Random();
        String[][] pair = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int randomNum = random.nextInt(BOUND_FOR_NUMBERS);
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

    public static String getQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
