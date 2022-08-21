package hexlet.code.games;

import java.util.Random;

public class GCD {
    private static String rightAnswer;
    public static void gcd() {
		Random random = new Random();
		final int boundForNumbers = 100;
		int randomNum1 = random.nextInt(boundForNumbers);
		int randomNum2 = random.nextInt(boundForNumbers);
		System.out.println("Question: " + randomNum1 + " " + randomNum2);
		int right = Math.min(randomNum1, randomNum2);
		for (var i = right; i >= 1; i--) {
			if (randomNum1 % i == 0 && randomNum2 % i == 0) {
				right = i;
				break;
			}
		}
		rightAnswer = String.valueOf(right);
	}
    public static void getCondition() {
		System.out.println("Find the greatest common divisor of given numbers.");
	}

    public static String getRightAnswer() {
		return rightAnswer;
	}
}
