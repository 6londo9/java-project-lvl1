package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    static final int ORIGIN_OF_LENGTH = 5;
    static final int BOUND_OF_LENGTH = 11;
    static final int ORIGIN_FOR_FIRST_NUMBER = 1;
    static final int BOUND_FOR_FIRST_NUMBER = 20;
    static final int ORIGIN_FOR_ARRAY_LENGTH = 2;
    static final int BOUND_FOR_ARRAY_LENGTH = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static String[][] getProgression() {
        Random random = new Random();
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int length = random.nextInt(ORIGIN_OF_LENGTH, BOUND_OF_LENGTH);
            int start = random.nextInt(ORIGIN_FOR_FIRST_NUMBER, BOUND_FOR_FIRST_NUMBER);
            int step = random.nextInt(ORIGIN_FOR_ARRAY_LENGTH, BOUND_FOR_ARRAY_LENGTH);
            int hiddenMemberIndex = random.nextInt(0, length - 1);
            String[] progression = generateProgression(start, step, length);
            arrayOfPairsQuestionsAndAnswers[i][1] = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            arrayOfPairsQuestionsAndAnswers[i][0] = String.join(" ", progression);
        }
        return arrayOfPairsQuestionsAndAnswers;
    }

    public static String getDescription() {
        return DESCRIPTION;
    }

    public static String[] generateProgression(int first, int step, int progressionLength) {
        String[] progression = new String[progressionLength];
        progression[0] = String.valueOf(first);
        for (var k = 1; k < progressionLength; k++) {
            int currentPartOfProgression = Integer.parseInt(progression[k - 1]) + step * k;
            progression[k] = String.valueOf(currentPartOfProgression);
        }
        return progression;
    }
}
