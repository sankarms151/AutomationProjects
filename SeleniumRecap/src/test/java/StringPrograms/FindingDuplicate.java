package StringPrograms;

import java.util.Arrays;

public class FindingDuplicate {


	public static void findDuplicates(String str) {

		char[] charArray = str.toCharArray();

		Arrays.sort(charArray);
		
		System.out.println("Duplicate characters are '" + str + "':");

		for (int i = 0; i < charArray.length -1; i++) {

			if (charArray[i] == charArray[i+1]) {

				System.out.println(charArray[i]);

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Sankar Viswanathan";
		
		findDuplicates(str);

	}

}
