package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class WordFinderTest {

    @Test
    public void testFindWordsWithMultipleResults() {
        String text = "This is a test sentence.";
        int digit = 5;
        List<String> words = WordFinder.findWords(text, digit);
        Assertions.assertEquals(0, words.size());
        Assertions.assertFalse(words.contains("test"));
        Assertions.assertFalse(words.contains("sentence"));
    }

    @Test
    public void testFindWordsWithNoResults() {
        String text = "This is a test sentence.";
        int digit = 9;
        List<String> words = WordFinder.findWords(text, digit);
        Assertions.assertTrue(words.isEmpty());
    }
}
