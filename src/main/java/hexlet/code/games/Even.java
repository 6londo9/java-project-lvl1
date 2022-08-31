package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    static final int BOUNDFORNUMBERS = 100;
    public static String[][] even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        String[][] pair = new String[Engine.GAMEROUNDS][2];
        for (var i = 0; i < Engine.GAMEROUNDS; i++) {
            int randomNum = random.nextInt(BOUNDFORNUMBERS);
            pair[i][0] = "Question: " + randomNum;
            pair[i][1] = randomNum % 2 == 0 ? "yes" : "no";
        }
        return pair;
    }
}
