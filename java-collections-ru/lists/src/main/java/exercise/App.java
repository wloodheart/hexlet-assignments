package exercise;

import java.util.*;

// BEGIN
class App {
    public static boolean scrabble(String chars, String word) {
        if (chars.isEmpty() || chars.length() < word.length()) {
            return false;
        }
        var wordList = new ArrayList<>(word
                .toLowerCase()
                .chars()
                .mapToObj(e -> (char) e)
                .toList());

        var charList = new ArrayList<>(chars
                .toLowerCase()
                .chars()
                .mapToObj(e -> (char) e)
                .toList());

        for (Character c : wordList) {
            if (!charList.remove(c)) {
                return false;
            }
        }
        return true;
    }
}
//END
