package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountingWordFrequency {
	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		countWordFrequency(str);
	}

	public static void countWordFrequency(String str) {
		String[] words = str.split("\\s+");
		Map<String, Integer> wordFrequency = new HashMap<>();

		for (String word : words) {
			word = word.toLowerCase(); // Convert to lowercase to handle case sensitivity
			if (wordFrequency.containsKey(word)) {
				wordFrequency.put(word, wordFrequency.get(word) + 1);
			} else {
				wordFrequency.put(word, 1);
			}
		}

		// Print word frequencies
		System.out.println("Word frequencies:");
		for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}