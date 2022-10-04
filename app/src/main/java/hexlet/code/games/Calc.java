package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    static final int DEFAULT_ORIGIN_FOR_NUMBERS = 0;
    static final int BOUND_FOR_NUMBERS = 20;
    static final Character[] OPERATORS = {'+', '-', '*'};

    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void runGame() {
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int randomNum1 = Utils.getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, BOUND_FOR_NUMBERS);
            int randomNum2 = Utils.getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, BOUND_FOR_NUMBERS);
            int randomOperatorIndex = Utils.getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, OPERATORS.length);
            var randomOperator = OPERATORS[randomOperatorIndex];

            arrayOfPairsQuestionsAndAnswers[i][0] = randomNum1 + " " + randomOperator + " " + randomNum2;
            arrayOfPairsQuestionsAndAnswers[i][1] = calculateValue(randomNum1, randomOperator, randomNum2);
        }
        Engine.engine(arrayOfPairsQuestionsAndAnswers, DESCRIPTION);
    }

    public static String calculateValue(int firstNumber, Character operator, int secondNumber) {
        int resultOfOperation;

        switch (operator) {
            case '+':
                resultOfOperation = firstNumber + secondNumber;
                break;
            case '-':
                resultOfOperation = firstNumber - secondNumber;
                break;
            case '*':
                resultOfOperation = firstNumber * secondNumber;
                break;
            default:
                throw new Error("Unknown operation: " + operator + "!");
        }

        return String.valueOf(resultOfOperation);
    }

}
