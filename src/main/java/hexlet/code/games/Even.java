package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    public static final int BOUND_FOR_NUMBERS = 100;

    public static String[][] even() {
        Random random = new Random();
        String[][] pair = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int randomNum = random.nextInt(BOUND_FOR_NUMBERS);
            pair[i][0] = "Question: " + randomNum;
            pair[i][1] = randomNum % 2 == 0 ? "yes" : "no";
        }
        return pair;
    }

    public static String getQuestion() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
