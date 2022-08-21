package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;

    public static void greetings() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = sc.next();
        System.out.println("Hello, " + name + "!");
    }
    public static String getName() {
        return name;
    }
}
