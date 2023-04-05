package CS5103;

import java.util.Scanner;

/**
 * Common utilities for the application.
 *
 */
public class Utils {

    /**
     * Read user input from command line.
     *
     * NOTE: If the input comes from the command line, it will not get new line characters.
     * @return String representing the user's input line.
     */
    public static String getInput() {
        System.out.println("Enter the input String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        return input;
    }
}
