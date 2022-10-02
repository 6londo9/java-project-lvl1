package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int numberForPrimeCheck = Utils.getLargeNumber();
            arrayOfPairsQuestionsAndAnswers[i][0] = String.valueOf(numberForPrimeCheck);
            arrayOfPairsQuestionsAndAnswers[i][1] = isPrime(numberForPrimeCheck) ? "yes" : "no";
        }
        Engine.engine(arrayOfPairsQuestionsAndAnswers, DESCRIPTION);
    }

    public static boolean isPrime(int numberForPrimeCheck) {
        boolean isPrime = numberForPrimeCheck != 1 && numberForPrimeCheck != 0;
        for (var k = 2; k <= Math.sqrt(numberForPrimeCheck); k++) {
            if (numberForPrimeCheck % k == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
