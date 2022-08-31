package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class Progression {
    static final int ORIGINOFLENGTH = 5;
    static final int BOUNDOFLENGTH = 11;
    static final int ORIGINFORFIRSTNUMBER = 1;
    static final int BOUNDFORFIRSTNUMBER = 20;
    static final int BOUNDFORARRAYLENGTH = 10;

    public static String[][] progression() {
        Random random = new Random();
        String[][] pair = new String[Engine.GAMEROUNDS][2];
        for (var i = 0; i < Engine.GAMEROUNDS; i++) {
            int length = random.nextInt(ORIGINOFLENGTH, BOUNDOFLENGTH);
            int start = random.nextInt(ORIGINFORFIRSTNUMBER, BOUNDFORFIRSTNUMBER);
            int progress = random.nextInt(BOUNDFORARRAYLENGTH);
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
