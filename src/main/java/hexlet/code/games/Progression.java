package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public class Progression {
	public static String rightAnswer;
	public static void progression() {
		Random random = new Random();
		int originOfLength = 5;
		int boundOfLength = 11;
		int length = random.nextInt(originOfLength, boundOfLength);
		int boundForFirstNumber = 20;
		int start = random.nextInt(boundForFirstNumber);
		int boundForArrayLength = 10;
		int progress = random.nextInt(boundForArrayLength);
		int cut = random.nextInt(0, length - 1);
		int[] progression = new int[length];
		progression[0] = start;
		String[] strProgression = new String[length];
		strProgression[0] = String.valueOf(progression[0]);
		for (var i = 1; i < length; i++) {
			progression[i] = progression[i - 1] + progress;
			strProgression[i] = String.valueOf(progression[i]);
		}
		var temp = strProgression[cut];
		strProgression[cut] = "..";
		rightAnswer = temp;
		var printArray = Arrays.toString(strProgression).replace("[", "").replace("]", "").replace(",", "");
		System.out.println("Question: " + printArray);
	}
	public static void getCondition() {
		System.out.println("What number is missing in the progression?");
	}
}
