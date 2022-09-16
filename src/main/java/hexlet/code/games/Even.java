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
            int numberForEvenCheck = random.nextInt(BOUND_FOR_NUMBERS);
            arrayOfPairsQuestionsAndAnswers[i][0] = String.valueOf(numberForEvenCheck);
            arrayOfPairsQuestionsAndAnswers[i][1] = checkIfNumberIsEven(numberForEvenCheck);
        }
        return arrayOfPairsQuestionsAndAnswers;
    }

    public static String getDescription() {
        return DESCRIPTION;
    }

    public static String checkIfNumberIsEven(int numberForEvenCheck) {
        return numberForEvenCheck % 2 == 0 ? "yes" : "no";
    }

}
