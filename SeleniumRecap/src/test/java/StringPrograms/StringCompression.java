package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static String compressString(String inputStr) { 
        if (inputStr == null || inputStr.isEmpty()) {
            return "";
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Build character count map
        for (char c : inputStr.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Build compressed string
        StringBuilder compressedStr = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            compressedStr.append(entry.getKey());
            compressedStr.append(entry.getValue());
        }

        return compressedStr.toString();
    }

    public static void main(String[] args) {
        String inputStr = "aabbccdd";
        String compressedStr = compressString(inputStr);
        System.out.println(compressedStr);  // Output: "a2b2c2d2"
    }
}
