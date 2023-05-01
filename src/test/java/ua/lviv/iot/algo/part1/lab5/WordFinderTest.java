package ua.lviv.iot.algo.part1.lab5;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WordFinderTest {
    @Test
    void testFindWords() {
        WordFinder finder = new WordFinder();
        String text = "This is a test input 123";
        List<String> expected = Arrays.asList();
        List<String> actual = finder.findWords(text, 3);
        assertEquals(expected, actual);
    }
}
