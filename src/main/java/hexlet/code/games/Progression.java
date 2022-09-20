package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Arrays;

public class Progression {

    static final int ORIGIN_OF_LENGTH = 5;
    static final int BOUND_OF_LENGTH = 11;
    static final int ORIGIN_FOR_FIRST_NUMBER = 2;
    static final int BOUND_FOR_FIRST_NUMBER = 20;
    static final int BOUND_FOR_ARRAY_LENGTH = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static String[][] getProgression() {
        Random random = new Random();
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int length = random.nextInt(ORIGIN_OF_LENGTH, BOUND_OF_LENGTH);
            int start = random.nextInt(ORIGIN_FOR_FIRST_NUMBER, BOUND_FOR_FIRST_NUMBER);
            int step = random.nextInt(ORIGIN_FOR_FIRST_NUMBER, BOUND_FOR_ARRAY_LENGTH);
            int hiddenMemberIndex = random.nextInt(0, length - 1);
            int[] progression = generateProgression(start, step, length);
            arrayOfPairsQuestionsAndAnswers[i][1] = String.valueOf(progression[hiddenMemberIndex]);
            String targetToReplace = arrayOfPairsQuestionsAndAnswers[i][1];
            String replacement = "..";
            arrayOfPairsQuestionsAndAnswers[i][0] = Arrays.toString(progression)
                    .replace(targetToReplace, replacement)
                    .replaceAll("\\[|\\]|,|", "");
        }
        return arrayOfPairsQuestionsAndAnswers;
    }

    public static String getDescription() {
        return DESCRIPTION;
    }

    public static int[] generateProgression(int first, int step, int progressionLength) {
        int[] progression = new int[progressionLength];
        progression[0] = first;
        for (var k = 1; k < progressionLength; k++) {
            int currentPartOfProgression = progression[k - 1] + step;
            progression[k] = currentPartOfProgression;
        }
        return progression;
    }
}
