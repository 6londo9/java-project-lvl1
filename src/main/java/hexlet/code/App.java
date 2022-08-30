package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        int choice = scan.nextInt();
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
        final int exit = 0;
        switch (choice) {
            case greet:
                greet();
                Cli.greetings();
                break;
            case exit:
                break;
            case even:
                Cli.greetings();
                Engine.engine(Even.even());
                break;
            case calc:
                Cli.greetings();
                Engine.engine(Calc.calc());
                break;
            case gcd:
                Cli.greetings();
                Engine.engine(GCD.gcd());
                break;
            case progression:
                Cli.greetings();
                Engine.engine(Progression.progression());
                break;
            case prime:
                Cli.greetings();
                Engine.engine(Prime.prime());
                break;
            default:
        }
    }

    private static void greet() {
        System.out.println("Welcome to the Brain Games!");
    }
}
