package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    static final int DEFAULT_ORIGIN_FOR_NUMBERS = 0;
    static final int BOUND_FOR_NUMBERS = 20;
    static final int ORIGIN_FOR_ARRAY_LENGTH = 5;
    static final int BOUND_FOR_ARRAY_LENGTH = 11;
    static final int ORIGIN_FOR_FIRST_NUMBER = 2;
    static final int BOUND_FOR_FIRST_NUMBER = 10;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void runGame() {
        String[][] questionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int length = Utils.getRandomNumber(ORIGIN_FOR_ARRAY_LENGTH, BOUND_FOR_ARRAY_LENGTH);
            int start = Utils.getRandomNumber(ORIGIN_FOR_FIRST_NUMBER, BOUND_FOR_NUMBERS);
            int step = Utils.getRandomNumber(ORIGIN_FOR_FIRST_NUMBER, BOUND_FOR_FIRST_NUMBER);
            int hiddenMemberIndex = Utils.getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, length - 1);

            String[] progression = generateProgression(start, step, length);
            questionsAndAnswers[i][1] = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            questionsAndAnswers[i][0] = String.join(" ", progression);
        }

        Engine.engine(questionsAndAnswers, DESCRIPTION);
    }

    public static String[] generateProgression(int first, int step, int progressionLength) {
        String[] progression = new String[progressionLength];
        progression[0] = Integer.toString(first);

        for (var i = 1; i < progressionLength; i++) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }
}
