package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int GAME_ROUNDS = 3;

    public static void engine(String[][] pair, String condition) {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(condition);
        for (var i = 0; i < GAME_ROUNDS; i++) {
            System.out.println(pair[i][0]);
            var answer = sc.next().toLowerCase();
            String rightAnswer = pair[i][1];
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                var wrong = "'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.";
                System.out.println(wrong);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
