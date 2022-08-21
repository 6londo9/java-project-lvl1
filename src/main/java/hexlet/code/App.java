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
            case 2:
                greet();
                Engine.engine(choice);
                break;
            case 3:
                greet();
                Engine.engine(choice);
            case 4:
                greet();
                Engine.engine(choice);
            case 5:
                greet();
                Engine.engine(choice);
            case 6:
                greet();
                Engine.engine(choice);
            case 0:
                break;
        }
    }

    private static void greet() {
        System.out.println("Welcome to Brain Games!");
    }
}
