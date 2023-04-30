package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordFinder {

    public static List<String> findWords(final String text, final int digit) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\w" + digit + "\\w*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }
}
