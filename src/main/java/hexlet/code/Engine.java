package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String[][] pair) {
        final int gameRounds = 3;
        Scanner sc = new Scanner(System.in);
        for (var i = 0; i < gameRounds; i++) {
            System.out.println(pair[i][0]);
            var answer = sc.next().toLowerCase();
            String rightAnswer = pair[i][1];
            if (answer.equals(rightAnswer) && i == 2) {
                System.out.println("Congratulations, " + Cli.getName() + "!");
            } else if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                var wrong = "'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.";
                System.out.println(wrong);
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
    }
}
