package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void runGame() {
        String[][] arrayOfPairsQuestionsAndAnswers = new String[Engine.GAME_ROUNDS][2];
        for (var i = 0; i < Engine.GAME_ROUNDS; i++) {
            int length = Utils.getArrayLength();
            int start = Utils.getOriginOfArray();
            int step = Utils.getStepForProgression();
            int hiddenMemberIndex = Utils.getRandomNumber(0, length - 1);
            String[] progression = generateProgression(start, step, length);
            arrayOfPairsQuestionsAndAnswers[i][1] = progression[hiddenMemberIndex];
            String targetToReplace = arrayOfPairsQuestionsAndAnswers[i][1];
            arrayOfPairsQuestionsAndAnswers[i][0] = String.join(" ", progression)
                    .replace(targetToReplace, "..");
        }
        Engine.engine(arrayOfPairsQuestionsAndAnswers, DESCRIPTION);
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
