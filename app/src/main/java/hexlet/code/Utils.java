package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomNumber(int originForNumber, int boundForNumber) {
        Random random = new Random();
        return random.nextInt(originForNumber, boundForNumber);
    }

}
