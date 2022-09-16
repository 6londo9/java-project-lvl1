package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static final Character[] OPERATORS = {'+', '-', '*'};
    public static final int BOUND_FOR_NUMBERS = 20;
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static String[][] getCalculation() {

        Random random = new Random();
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int randomNum1 = random.nextInt(BOUND_FOR_NUMBERS);
            int randomNum2 = random.nextInt(BOUND_FOR_NUMBERS);
            int randomOperatorIndex = random.nextInt(OPERATORS.length);
            var randomOperator = OPERATORS[randomOperatorIndex];
            arrayOfPairsQuestionsAndAnswers[i][0] = randomNum1 + " " + randomOperator + " " + randomNum2;
            arrayOfPairsQuestionsAndAnswers[i][1] = calculateValue(randomNum1, randomOperator, randomNum2);
        }
        return arrayOfPairsQuestionsAndAnswers;
    }

    public static String getDescription() {
        return DESCRIPTION;
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
