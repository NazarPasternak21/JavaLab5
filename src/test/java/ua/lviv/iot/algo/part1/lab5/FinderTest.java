package ua.lviv.iot.algo.part1.lab5;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FinderTest {
    private Finder finder;

    @BeforeEach
    public void setUp() {
        finder = new Finder();
    }

    @AfterEach
    public void tearDown() {
        finder = null;
    }

    @Test
    public void testFindWords() {
        String text = "H1llo w0rld and test";
        int digit = 1;
        List<String> expected = List.of("H1llo");
        List<String> actual = finder.findWords(text, digit);
        assertEquals(expected, actual);
    }
}
