package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public class Progression {

    public static String[][] progression() {
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        final int questions = 3;
        String[][] pair = new String[questions][2];
        for (var i = 0; i < questions; i++) {
            final int originOfLength = 5;
            final int boundOfLength = 11;
            int length = random.nextInt(originOfLength, boundOfLength);
            final int originForFirstNumber = 1;
            final int boundForFirstNumber = 20;
            int start = random.nextInt(originForFirstNumber, boundForFirstNumber);
            final int boundForArrayLength = 10;
            int progress = random.nextInt(boundForArrayLength);
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
}
