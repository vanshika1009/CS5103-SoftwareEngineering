package CS5103;

import java.util.HashMap;
import java.util.Map;

/**
 * Program to count unique words along with their occurrences.
 *
 * @author abhishek
 */
public class WordCounter {
    /**
     * Executes the word counter application.
     */
    public void execute() {
        String input = Utils.getInput();
        System.out.println("Frequency counts are: ");
        System.out.println(getWordCounts(input));
    }

    /**
     * Compute pairs of unique words and their occurrences.
     *
     * @param input String containing words and/or spaces/newline/tab characters
     * @return Map of word to count
     */
    public Map<String, Integer> getWordCounts(final String input) {
        Map<String, Integer> resultMap = new HashMap<>();

        // edge cases
        if (input == null || input.trim().length() == 0) {
            return resultMap;
        }

        // Regular expression to determine space, new line or tab character.
        String[] splitResult = input.split("[\\s|\\n|\\t]");
        for (String str : splitResult) {
            if (!str.isEmpty()) {
                // get the current count from map and add one
                int currentCount = resultMap.getOrDefault(str, 0);
                resultMap.put(str, currentCount + 1);
            }
        }

        return resultMap;
    }
}
