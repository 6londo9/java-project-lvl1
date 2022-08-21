package hexlet.code.games;

import java.util.Random;

public class Calc {
	public static String rightAnswer;

	public static void calc() {
		Random random = new Random();
		int randomNum1 = random.nextInt(20);
		int randomNum2 = random.nextInt(20);
		Character[] operator = {'+', '-', '*'};
		var bound = random.nextInt(3);
		var randOper = operator[bound];
		int right;
		switch (randOper) {
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
		}
		System.out.println("Question: " + randomNum1 + " " + randOper + " " + randomNum2);
	}
	public static void getCondition() {
		System.out.println("What is the result of the expression?");
	}
}
