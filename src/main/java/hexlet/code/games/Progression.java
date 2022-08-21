package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public class Progression {
	public static String rightAnswer;
	public static void progression() {
		Random random = new Random();
		int length = random.nextInt(5, 11);
		int start = random.nextInt(20);
		int progress = random.nextInt(10);
		int cut = random.nextInt(0, length - 1);
		int[] prog = new int[length];
		prog[0] = start;
		String[] strProg = new String[length];
		strProg[0] = String.valueOf(prog[0]);
		for (var i = 1; i < length; i++) {
			prog[i] = prog[i - 1] + progress;
			strProg[i] = String.valueOf(prog[i]);
		}
		var temp = strProg[cut];
		strProg[cut] = "..";
		rightAnswer = temp;
		System.out.println("Question: " + Arrays.toString(strProg));
	}
	public static void getCondition() {
		System.out.println("What number is missing in the progression?");
	}
}
