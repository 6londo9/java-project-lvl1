package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int GAME_ROUNDS = 3;

    public static void engine(String[][] arrayOfPairsQuestionsAndAnswers, String descriptionOfGame) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(descriptionOfGame);

        for (String[] roundData : arrayOfPairsQuestionsAndAnswers) {
            String question = roundData[0];
            String answer = roundData[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = sc.next().toLowerCase();

            if (!userAnswer.equals(answer)) {
                System.out.println(
                        "'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + answer + "'."
                );
                System.out.println("Let's try again, " + name + "!");
                sc.close();
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
        sc.close();
    }
}
