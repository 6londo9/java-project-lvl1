package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    public static final int BOUND_FOR_NUMBERS = 100;
    public static String[][] gcd() {
        Random random = new Random();
        String[][] pair = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int rightAnswer;
            int randomNum1 = random.nextInt(BOUND_FOR_NUMBERS);
            int randomNum2 = random.nextInt(BOUND_FOR_NUMBERS);
            pair[i][0] = "Question: " + randomNum1 + " " + randomNum2;
            if (randomNum1 == 0 || randomNum2 == 0) {
                rightAnswer = Math.max(randomNum1, randomNum2);
            } else {
                rightAnswer = gcdLogic(randomNum1, randomNum2);
            }
            pair[i][1] = String.valueOf(rightAnswer);
        }
        return pair;
    }

    public static String getQuestion() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static int gcdLogic(int firstNumber, int secondNumber) {
        int gcd = Math.min(firstNumber, secondNumber);
        for (var k = gcd; k >= 1; k--) {
            if (firstNumber % k == 0 && secondNumber % k == 0) {
                gcd = k;
                break;
            }
        }
        return gcd;
    }

}
