package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Sankar Viswanathan";
        String result = removeDuplicates(str);
        System.out.println("Original string: " + str);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        // Using Map to track characters and their counts
        Map<Character, Integer> charMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        // Iterate through each character in the string
        //for (int i = 0; i < str.length(); i++) {
            //char c = str.charAt(i);
        for (char c : str.toCharArray()) {
				          
            // If the character is not already in the map, add it to the StringBuilder
            if (!charMap.containsKey(c)) {
                charMap.put(c, 1);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

