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
            int numberToCheckIfPrime = random.nextInt(BOUND_FOR_NUMBERS);
            arrayOfPairsQuestionsAndAnswers[i][0] = String.valueOf(numberToCheckIfPrime);
            arrayOfPairsQuestionsAndAnswers[i][1] = checkIfNumberIsPrime(numberToCheckIfPrime);
        }
        return arrayOfPairsQuestionsAndAnswers;
    }

    public static String getDescription() {
        return DESCRIPTION;
    }

    public static String checkIfNumberIsPrime(int numberToCheck) {
        boolean check = numberToCheck != 1 && numberToCheck != 0;
        for (var k = 2; k <= Math.sqrt(numberToCheck); k++) {
            if (numberToCheck % k == 0) {
                check = false;
                break;
            }
        }
        return check ? "yes" : "no";
    }

}
