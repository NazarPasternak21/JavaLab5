package ua.lviv.iot.algo.part1.lab5;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testFindWords() {
        String text = "The quick brown fox jumps over the lazy dog";
        int digit = 5;
        List<String> expectedWords = Arrays.asList();
        List<String> actualWords = WordFinder.findWords(text, digit);
        assertEquals(expectedWords, actualWords);
    }

}
