package hexlet.code.games;

import java.util.Random;

public class Prime {
	public static String rightAnswer;
	public static void prime() {
		Random random = new Random();
		int randomNum = random.nextInt(100);
		boolean check = randomNum != 1;
		for (var i = 2; i < Math.sqrt(randomNum); i++) {
			if (randomNum % i == 0) {
				check = false;
				break;
			}
		}
		rightAnswer = check ? "yes" : "no";
		System.out.println("Question: " + randomNum);
	}
	public static void getCondition() {
		System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
	}
}
