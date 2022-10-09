package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    static final int DEFAULT_ORIGIN_FOR_NUMBERS = 0;
    static final int LARGE_BOUND_FOR_NUMBERS = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] questionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int numberForEvenCheck = Utils.getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, LARGE_BOUND_FOR_NUMBERS);

            questionsAndAnswers[i][0] = String.valueOf(numberForEvenCheck);
            questionsAndAnswers[i][1] = isEven(numberForEvenCheck) ? "yes" : "no";
        }

        Engine.engine(questionsAndAnswers, DESCRIPTION);
    }

    public static boolean isEven(int numberForEvenCheck) {
        return numberForEvenCheck % 2 == 0;
    }

}
