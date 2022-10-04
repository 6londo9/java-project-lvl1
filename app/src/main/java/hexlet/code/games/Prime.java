package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    static final int DEFAULT_ORIGIN_FOR_NUMBERS = 0;
    static final int LARGE_BOUND_FOR_NUMBERS = 100;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int numberForPrimeCheck = Utils.getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, LARGE_BOUND_FOR_NUMBERS);

            arrayOfPairsQuestionsAndAnswers[i][0] = String.valueOf(numberForPrimeCheck);
            arrayOfPairsQuestionsAndAnswers[i][1] = isPrime(numberForPrimeCheck) ? "yes" : "no";
        }

        Engine.engine(arrayOfPairsQuestionsAndAnswers, DESCRIPTION);
    }

    public static boolean isPrime(int numberForPrimeCheck) {

        if (numberForPrimeCheck < 2) {
            return false;
        }

        for (var k = 2; k <= Math.sqrt(numberForPrimeCheck); k++) {
            if (numberForPrimeCheck % k == 0) {
                return false;
            }
        }

        return true;
    }

}
