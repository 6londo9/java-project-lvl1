package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    static final Character[] OPERATOR = {'+', '-', '*'};
    static final int BOUNDFORNUMBERS = 20;
    public static String[][] calc() {
        Random random = new Random();
        String[][] pair = new String[Engine.GAMEROUNDS][2];
        for (var i = 0; i < Engine.GAMEROUNDS; i++) {
            int randomNum1 = random.nextInt(BOUNDFORNUMBERS);
            int randomNum2 = random.nextInt(BOUNDFORNUMBERS);
            int boundForOperators = random.nextInt(OPERATOR.length);
            var randomOperation = OPERATOR[boundForOperators];
            int right = 0;
            switch (randomOperation) {
                case '+':
                    right = randomNum1 + randomNum2;
                    break;
                case '-':
                    right = randomNum1 - randomNum2;
                    break;
                case '*':
                    right = randomNum1 * randomNum2;
                    break;
                default:
                    break;
            }
            pair[i][0] = "Question: " + randomNum1 + " " + randomOperation + " " + randomNum2;
            pair[i][1] = String.valueOf(right);
        }
        return pair;
    }
    public static String getQuestion() {
        return "What is the result of the expression?";
    }
}
