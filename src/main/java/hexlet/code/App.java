package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                greet();
                Cli.greetings();
                break;
            case 0:
                break;
            default:
                greet();
                Engine.engine(choice);
                break;
        }
    }

    private static void greet() {
        System.out.println("Welcome to the Brain Games!");
    }
}
