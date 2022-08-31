package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    static final int BOUNDFORNUMBERS = 100;
    public static String[][] prime() {
        Random random = new Random();
        String[][] pair = new String[Engine.GAMEROUNDS][2];
        for (var i = 0; i < Engine.GAMEROUNDS; i++) {
            int randomNum = random.nextInt(BOUNDFORNUMBERS);
            boolean check = randomNum != 1 && randomNum != 0;
            for (var k = 2; k <= Math.sqrt(randomNum); k++) {
                if (randomNum % k == 0) {
                    check = false;
                    break;
                }
            }
            pair[i][1] = check ? "yes" : "no";
            pair[i][0] = "Question: " + randomNum;
        }
        return pair;
    }
    public static String getQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
