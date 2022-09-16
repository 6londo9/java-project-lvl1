package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    public static final int BOUND_FOR_NUMBERS = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[][] isEven() {
        Random random = new Random();
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int numberToCheckParity = random.nextInt(BOUND_FOR_NUMBERS);
            arrayOfPairsQuestionsAndAnswers[i][0] = String.valueOf(numberToCheckParity);
            arrayOfPairsQuestionsAndAnswers[i][1] = checkIfNumberIsEven(numberToCheckParity);
        }
        return arrayOfPairsQuestionsAndAnswers;
    }

    public static String getDescription() {
        return DESCRIPTION;
    }

    public static String checkIfNumberIsEven(int numberToCheck) {
        return numberToCheck % 2 == 0 ? "yes" : "no";
    }

}
