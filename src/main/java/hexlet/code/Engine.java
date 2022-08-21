package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
	private static String rightAnswer;
	public static void engine(int a) {
		Cli.greetings();
		switch (a) {
			case 2 -> Even.getCondition();
			case 3 -> Calc.getCondition();
			case 4 -> GCD.getCondition();
			case 5 -> Progression.getCondition();
			case 6 -> Prime.getCondition();
		}
		Scanner sc = new Scanner(System.in);
		for (var i = 0; i < 3; i++) {
			switch (a) {
				case 2 -> Even.even();
				case 3 -> Calc.calc();
				case 4 -> GCD.gcd();
				case 5 -> Progression.progression();
				case 6 -> Prime.prime();
			}
			var answer = sc.next().toLowerCase();
			switch (a) {
				case 2 -> rightAnswer = Even.rightAnswer;
				case 3 -> rightAnswer = Calc.rightAnswer;
				case 4 -> rightAnswer = GCD.rightAnswer;
				case 5 -> rightAnswer = Progression.rightAnswer;
				case 6 -> rightAnswer = Prime.rightAnswer;
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
