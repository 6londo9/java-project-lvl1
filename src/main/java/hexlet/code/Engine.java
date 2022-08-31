package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int GAMEROUNDS = 3;
    public static void engine(String[][] pair) {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        for (var i = 0; i < GAMEROUNDS; i++) {
            System.out.println(pair[i][0]);
            var answer = sc.next().toLowerCase();
            String rightAnswer = pair[i][1];
            if (answer.equals(rightAnswer)) {
                if (i == GAMEROUNDS - 1) {
                    System.out.println("Congratulations, " + name + "!");
                }
                System.out.println("Correct!");
            } else {
                var wrong = "'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.";
                System.out.println(wrong);
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
    }
}
