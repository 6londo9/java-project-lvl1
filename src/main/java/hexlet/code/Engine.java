package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    private static String rightAnswer;
    public static void engine(int a) {
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        final int gameRounds = 3;
        Cli.greetings();
        switch (a) {
		    case even -> Even.getCondition();
		    case calc -> Calc.getCondition();
		    case gcd -> GCD.getCondition();
		    case progression -> Progression.getCondition();
            case prime -> Prime.getCondition();
            default -> {
            }
        }
        Scanner sc = new Scanner(System.in);
        for (var i = 0; i < gameRounds; i++) {
            switch (a) {
                case even -> Even.even();
                case calc -> Calc.calc();
                case gcd -> GCD.gcd();
                case progression -> Progression.progression();
                case prime -> Prime.prime();
                default -> {
                }
            }
            var answer = sc.next().toLowerCase();
            switch (a) {
                case even -> rightAnswer = Even.getRightAnswer();
                case calc -> rightAnswer = Calc.getRightAnswer();
                case gcd -> rightAnswer = GCD.getRightAnswer();
                case progression -> rightAnswer = Progression.getRightAnswer();
                case prime -> rightAnswer = Prime.getRightAnswer();
                default -> {
                }
            }
            var wrong = "'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.";
            if (answer.equals(rightAnswer) && i == 2) {
                System.out.println("Congratulations, " + Cli.getName() + "!");
            } else if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(wrong);
                System.out.println("Let's try again, " + Cli.getName() + "!");
                i = 2;
            }
        }
    }
}
