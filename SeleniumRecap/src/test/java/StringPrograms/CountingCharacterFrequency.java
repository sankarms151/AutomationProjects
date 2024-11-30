package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacterFrequency {
    public static void main(String[] args) {
        String inputString = "India is India";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) { // Consider only letters
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }
}