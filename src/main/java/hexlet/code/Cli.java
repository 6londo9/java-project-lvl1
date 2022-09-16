package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;

    public static void greetUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = sc.next();
        System.out.println("Hello, " + name + "!");
    }
}
