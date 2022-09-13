package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static final Character[] OPERATORS = {'+', '-', '*'};
    public static final int BOUND_FOR_NUMBERS = 20;
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static String[][] calc() {

        Random random = new Random();
        String[][] pair = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int randomNum1 = random.nextInt(BOUND_FOR_NUMBERS);
            int randomNum2 = random.nextInt(BOUND_FOR_NUMBERS);
            int operatorsLength = random.nextInt(OPERATORS.length);
            var randomOperation = OPERATORS[operatorsLength];
            int rightAnswer;
            switch (randomOperation) {
                case '+':
                    rightAnswer = randomNum1 + randomNum2;
                    break;
                case '-':
                    rightAnswer = randomNum1 - randomNum2;
                    break;
                case '*':
                    rightAnswer = randomNum1 * randomNum2;
                    break;
                default:
                    throw new Error("Unknown operation: " + randomOperation + "!");
            }
            pair[i][0] = randomNum1 + " " + randomOperation + " " + randomNum2;
            pair[i][1] = String.valueOf(rightAnswer);
        }
        return pair;
    }

    public static String getQuestion() {
        return DESCRIPTION;
    }
}
