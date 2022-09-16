package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    public static final int BOUND_FOR_NUMBERS = 100;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[][] isPrime() {
        Random random = new Random();
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int numberForPrimeCheck = random.nextInt(BOUND_FOR_NUMBERS);
            arrayOfPairsQuestionsAndAnswers[i][0] = String.valueOf(numberForPrimeCheck);
            arrayOfPairsQuestionsAndAnswers[i][1] = checkIfNumberIsPrime(numberForPrimeCheck);
        }
        return arrayOfPairsQuestionsAndAnswers;
    }

    public static String getDescription() {
        return DESCRIPTION;
    }

    public static String checkIfNumberIsPrime(int numberForPrimeCheck) {
        boolean isNumberPrime = numberForPrimeCheck != 1 && numberForPrimeCheck != 0;
        for (var k = 2; k <= Math.sqrt(numberForPrimeCheck); k++) {
            if (numberForPrimeCheck % k == 0) {
                isNumberPrime = false;
                break;
            }
        }
        return isNumberPrime ? "yes" : "no";
    }

}
