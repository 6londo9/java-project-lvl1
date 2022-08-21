package hexlet.code.games;

import java.util.Random;

public class Even {
	public static String rightAnswer;
	public static void even() {
		Random random = new Random();
		int boundForNumber = 100;
		int randomNum = random.nextInt(boundForNumber);
		System.out.println("Question: " + randomNum);
		rightAnswer = randomNum % 2 == 0 ? "yes" : "no";
	}
	public static void getCondition() {
		System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
	}
}
