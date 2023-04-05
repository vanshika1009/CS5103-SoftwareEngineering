package CS5103;

import java.util.Scanner;

/**
 * Program to perform word replacements.
 */
public class WordStatistics {
    public void execute() {
        String input = Utils.getInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source word to replace: ");
        String source = sc.nextLine();

        System.out.println("Enter the target word to replace with: ");
        String target = sc.nextLine();

        String replacement = replaceWords(input, source, target);
        System.out.println("Result is : " + replacement);
    }

    /**
     * Replaces all the occurrences of the string represented by "source" with "target"
     * in the input string.
     *
     * @param input input string.
     * @param source word to be replaced.
     * @param target word to be replaced with.
     * @return a new string with all the replacements of source with target.
     */
    public String replaceWords(final String input, final String source, final String target) {
        // base case
        if (input == null || input.length() == 0) {
            return input;
        }

        // Construct a regular expression with the boundary character in it, as we are only
        // interested in replacing the whole word.
        String regex = "\\b" + source + "\\b";

        String newString = input.replaceAll(regex, target);
        return newString;
    }
}
