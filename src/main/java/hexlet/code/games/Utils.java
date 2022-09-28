package hexlet.code.games;

import java.util.Random;

public class Utils {

    static final int DEFAULT_ORIGIN_FOR_NUMBERS = 0;
    static final int LARGE_BOUND_FOR_NUMBERS = 100;
    static final int BOUND_FOR_NUMBERS = 20;
    static final int ORIGIN_FOR_ARRAY_LENGTH = 5;
    static final int BOUND_FOR_ARRAY_LENGTH = 11;
    static final int ORIGIN_FOR_FIRST_NUMBER = 2;
    static final int BOUND_FOR_FIRST_NUMBER = 10;

    public static int getLargeNumber() {
        return getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, LARGE_BOUND_FOR_NUMBERS);
    }

    public static int getSmallNumber() {
        return getRandomNumber(DEFAULT_ORIGIN_FOR_NUMBERS, BOUND_FOR_NUMBERS);
    }

    public static int getOriginOfArray() {
        return getRandomNumber(ORIGIN_FOR_FIRST_NUMBER, BOUND_FOR_NUMBERS);
    }

    public static int getArrayLength() {
        return getRandomNumber(ORIGIN_FOR_ARRAY_LENGTH, BOUND_FOR_ARRAY_LENGTH);
    }

    public static int getStepForProgression() {
        return getRandomNumber(ORIGIN_FOR_FIRST_NUMBER, BOUND_FOR_FIRST_NUMBER);
    }

    public static int getRandomNumber(int originForNumber, int boundForNumber) {
        Random random = new Random();
        return random.nextInt(originForNumber, boundForNumber);
    }

}
