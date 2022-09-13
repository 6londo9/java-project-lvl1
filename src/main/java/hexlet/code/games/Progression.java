package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    static final int ORIGIN_OF_LENGTH = 5;
    static final int BOUND_OF_LENGTH = 11;
    static final int ORIGIN_FOR_FIRST_NUMBER = 1;
    static final int BOUND_FOR_FIRST_NUMBER = 20;
    static final int BOUND_FOR_ARRAY_LENGTH = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static String[][] progression() {
        Random random = new Random();
        String[][] pair = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int length = random.nextInt(ORIGIN_OF_LENGTH, BOUND_OF_LENGTH);
            int start = random.nextInt(ORIGIN_FOR_FIRST_NUMBER, BOUND_FOR_FIRST_NUMBER);
            int step = random.nextInt(BOUND_FOR_ARRAY_LENGTH);
            int hiddenMemberIndex = random.nextInt(0, length - 1);
            String[] progression = makeProgression(start, step, length);
            pair[i][1] = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            pair[i][0] = String.join(" ", progression);
        }
        return pair;
    }

    public static String getQuestion() {
        return DESCRIPTION;
    }

    public static String[] makeProgression(int first, int step, int progressionLenght) {
        String[] progression = new String[progressionLenght];
        progression[0] = String.valueOf(first);
        for (var k = 1; k < progressionLenght; k++) {
            int partOfProgression = Integer.parseInt(progression[k - 1]) + step;
            progression[k] = String.valueOf(partOfProgression);
        }
        return progression;
    }
}
