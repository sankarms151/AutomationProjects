package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterInString {

	public static void main(String[] args) {
		String str1 = "abcrgf";
		String str2 = "abcdth";

		String commonPrefix = findCommonPrefix(str1, str2);

		System.out.println("Common prefix: " + commonPrefix); // Output: Common prefix: 
	}

	public static String findCommonPrefix(String str1, String str2) {

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : str1.toCharArray()) {

			charMap.put(c, charMap.getOrDefault(c,0) + 1);

		}

		StringBuilder builder = new StringBuilder();


		for (char c : str2.toCharArray()) {

			if(charMap.containsKey(c) && charMap.get(c) > 0) {

				builder.append(c);
				charMap.put(c, charMap.get(c) - 1);

			} else {
				break;
			}

		}

		return builder.toString();
	}



}
