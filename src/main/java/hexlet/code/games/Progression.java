package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;

public class Progression {

    static final int ORIGIN_OF_LENGTH = 5;
    static final int BOUND_OF_LENGTH = 11;
    static final int ORIGIN_FOR_FIRST_NUMBER = 1;
    static final int BOUND_FOR_FIRST_NUMBER = 20;
    static final int BOUND_FOR_ARRAY_LENGTH = 10;

    public static String[][] progression() {
        Random random = new Random();
        String[][] pair = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int length = random.nextInt(ORIGIN_OF_LENGTH, BOUND_OF_LENGTH);
            int start = random.nextInt(ORIGIN_FOR_FIRST_NUMBER, BOUND_FOR_FIRST_NUMBER);
            int progress = random.nextInt(BOUND_FOR_ARRAY_LENGTH);
            int cut = random.nextInt(0, length - 1);
            int[] progression = new int[length];
            progression[0] = start;
            String[] strProgression = new String[length];
            strProgression[0] = String.valueOf(progression[0]);
            for (var k = 1; k < length; k++) {
                progression[k] = progression[k - 1] + progress;
                strProgression[k] = String.valueOf(progression[k]);
            }
            var temp = strProgression[cut];
            strProgression[cut] = "..";
            pair[i][1] = temp;
            var printArray = Arrays.toString(strProgression).replace("[", "").replace("]", "").replace(",", "");
            pair[i][0] = "Question: " + printArray;
        }
        return pair;
    }

    public static String getQuestion() {
        return "What number is missing in the progression?";
    }
}
