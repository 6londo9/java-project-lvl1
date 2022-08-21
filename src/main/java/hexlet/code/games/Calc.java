package hexlet.code.games;

import java.util.Random;

public class Calc {
	public static String rightAnswer;

	public static void calc() {
		Random random = new Random();
		int boundForNumbers = 20;
		int randomNum1 = random.nextInt(boundForNumbers);
		int randomNum2 = random.nextInt(boundForNumbers);
		Character[] operator = {'+', '-', '*'};
		var boundForOperators = random.nextInt(3);
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
		System.out.println("Question: " + randomNum1 + " " + randomOperation + " " + randomNum2);
	}
	public static void getCondition() {
		System.out.println("What is the result of the expression?");
	}
}
