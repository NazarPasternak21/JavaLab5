package ua.lviv.iot.algo.part1.lab5;
import org.junit.jupiter.api.Test;
public class MainTest {
    @Test
    void testRun() {
        Main app = new Main();
        String input = "This is a test input 123\n" + "3\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        app.run();
        System.setIn(System.in);
    }
}
