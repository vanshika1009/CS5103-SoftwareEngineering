package CS5103;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordStatisticsTest {
    private WordStatistics wordStatistics;

    @Before
    public void setup() {
        wordStatistics = new WordStatistics();
    }

    @Test
    public void testBasic() {
        String input = "hello there how are you";
        String actualOutput = wordStatistics.replaceWords(input, "hello", "test");
        String expectedOutput = "test there how are you";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReplacementWithMultipleOccurrences() {
        String input = "hello hello hello how are you";
        String actualOutput = wordStatistics.replaceWords(input, "hello", "test");
        String expectedOutput = "test test test how are you";
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReplacementWithNoMatch() {
        String input = "hello there how are you";
        String actualOutput = wordStatistics.replaceWords(input, "bye", "test");
        Assert.assertEquals(input, actualOutput);
    }
}
