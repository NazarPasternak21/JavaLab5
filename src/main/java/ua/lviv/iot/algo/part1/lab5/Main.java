package ua.lviv.iot.algo.part1.lab5;

import java.util.List;
import java.util.Scanner;

public class Main {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        System.out.println("Enter digit:");
        int digit = scanner.nextInt();
        List<String> words = new WordFinder().findWords(text, digit);
        String output = "Words containing digit " + digit + ":";
        System.out.println(output);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(final String[] args) {
        Main app = new Main();
        app.run();
    }
}
