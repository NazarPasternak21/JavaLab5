package ua.lviv.iot.algo.part1.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Finder {

    public static void main(final String[] args) {
        if (args.length < 2) {
            System.out.println("Write: <text> and <digit>");
            return;
        }
        String text = args[0];
        int digit = Integer.parseInt(args[1]);
        Finder finder = new Finder();
        finder.find(text,digit);
    }

    public void find(final String text, final int digit) {
        System.out.println("Text to process:" + text);
        List<String> words = findWords(text, digit);
        String output = "Words containing digit " + digit + ":";
        System.out.println(output);
        System.out.println("text after process:");
        for (String word : words) {
            System.out.println(word);
        }
    }
    public List<String> findWords(final String text, final int digit) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\w" + digit + "\\w*\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }
}
