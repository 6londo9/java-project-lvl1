package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String[][] calc() {
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        final int questions = 3;
        String rightAnswer = "";
        String[][] pair = new String[questions][2];
        for (var i = 0; i < questions; i++) {
            final int boundForNumbers = 20;
            int randomNum1 = random.nextInt(boundForNumbers);
            int randomNum2 = random.nextInt(boundForNumbers);
            Character[] operator = {'+', '-', '*'};
            final int operatorChoose = 3;
            int boundForOperators = random.nextInt(operatorChoose);
            var randomOperation = operator[boundForOperators];
            int right;
            switch (randomOperation) {
                case '+' -> {
                    right = randomNum1 + randomNum2;
                    rightAnswer = String.valueOf(right);
                }
                case '-' -> {
                    right = randomNum1 - randomNum2;
                    rightAnswer = String.valueOf(right);
                }
                case '*' -> {
                    right = randomNum1 * randomNum2;
                    rightAnswer = String.valueOf(right);
                }
                default -> {
                }
            }
            pair[i][0] = "Question: " + randomNum1 + " " + randomOperation + " " + randomNum2;
            pair[i][1] = rightAnswer;
        }
        return pair;
    }
}
