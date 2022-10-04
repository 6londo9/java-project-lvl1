package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int selectedGame = scanner.nextInt();

        switch (selectedGame) {
            case GREET:
                System.out.println("Welcome to the Brain Games!");
                Cli.greetUser();
                break;
            case EXIT:
                System.out.println("Goodbye!");
                break;
            case EVEN:
                Even.runGame();
                break;
            case CALC:
                Calc.runGame();
                break;
            case GCD:
                Gcd.runGame();
                break;
            case PROGRESSION:
                Progression.runGame();
                break;
            case PRIME:
                Prime.runGame();
                break;
            default:
                throw new Error("Unknown game number: " + selectedGame + "!. Restart the game.");
        }

        scanner.close();
    }

}
