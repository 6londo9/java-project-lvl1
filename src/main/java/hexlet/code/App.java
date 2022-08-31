package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    static final int GREET = 1;
    static final int EVEN = 2;
    static final int CALC = 3;
    static final int GCD = 4;
    static final int PROGRESSION = 5;
    static final int PRIME = 6;
    static final int EXIT = 0;
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
                Engine.engine(Even.even());
                break;
            case CALC:
                Engine.engine(Calc.calc());
                break;
            case GCD:
                Engine.engine(Gcd.gcd());
                break;
            case PROGRESSION:
                Engine.engine(Progression.progression());
                break;
            case PRIME:
                Engine.engine(Prime.prime());
                break;
            default:
        }
    }

    private static void greet() {
        System.out.println("Welcome to the Brain Games!");
    }
}
