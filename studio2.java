package org.launchcode.java.studio2;
import java.util.HashMap;
import java.util.Map;

public class Counting_Characters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        String phrase = "Who lives in a pineapple under the sea?";
        char[] charactersInPhrase = phrase.toCharArray();

        for (char character : charactersInPhrase) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            } else {
                characterCounts.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ":" + oneChar.getValue());
        }
    }
}
