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
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        int choice = scan.nextInt();
        switch (choice) {
            case GREET:
                greet();
                Cli.greetings();
                break;
            case EXIT:
                break;
            case EVEN:
                Engine.engine(Even.even(), Even.getQuestion());
                break;
            case CALC:
                Engine.engine(Calc.calc(), Calc.getQuestion());
                break;
            case GCD:
                Engine.engine(Gcd.gcd(), Gcd.getQuestion());
                break;
            case PROGRESSION:
                Engine.engine(Progression.progression(), Progression.getQuestion());
                break;
            case PRIME:
                Engine.engine(Prime.prime(), Prime.getQuestion());
                break;
            default:
                throw new Error("Unknown game number: " + choice + "!");
        }
    }

    private static void greet() {
        System.out.println("Welcome to the Brain Games!");
    }
}
