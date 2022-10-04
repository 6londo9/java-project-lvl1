package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    static final int DEFAULT_ORIGIN_FOR_NUMBERS = 0;
    static final int LARGE_BOUND_FOR_NUMBERS = 100;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int rightAnswer;
            int randomNum1 = Utils.getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, LARGE_BOUND_FOR_NUMBERS);
            int randomNum2 = Utils.getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, LARGE_BOUND_FOR_NUMBERS);

            arrayOfPairsQuestionsAndAnswers[i][0] = randomNum1 + " " + randomNum2;
            rightAnswer = gcd(randomNum1, randomNum2);
            arrayOfPairsQuestionsAndAnswers[i][1] = String.valueOf(rightAnswer);
        }

        Engine.engine(arrayOfPairsQuestionsAndAnswers, DESCRIPTION);
    }

    public static int gcd(int firstNumber, int secondNumber) {
        int gcd;

        if (firstNumber == 0 || secondNumber == 0) {
            gcd = Math.max(firstNumber, secondNumber);

        } else {
            gcd = Math.min(firstNumber, secondNumber);
            for (var k = gcd; k >= 1; k--) {
                if (firstNumber % k == 0 && secondNumber % k == 0) {
                    gcd = k;
                    break;
                }
            }
        }

        return gcd;
    }

}
