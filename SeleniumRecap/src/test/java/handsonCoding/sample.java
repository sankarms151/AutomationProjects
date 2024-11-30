package handsonCoding;

import java.util.HashMap;
import java.util.Map;

public class sample {

	public static void main(String[] args) {

		String str = "aabbbAhHjjJooOppPB";
		String result = compress(str);
		
		System.out.println(result);


	}


	public static String compress(String str) {

		str = str.toLowerCase();


		Map<Character, Integer> charMap = new HashMap<Character, Integer>();


		for (char ch : str.toCharArray()) {

			charMap.put(ch, charMap.getOrDefault(ch,0) + 1);


		}

		StringBuilder sb = new StringBuilder();

		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {

			sb.append(entry.getKey());

			sb.append(entry.getValue());

		}
		
		return sb.toString();

	}

}

