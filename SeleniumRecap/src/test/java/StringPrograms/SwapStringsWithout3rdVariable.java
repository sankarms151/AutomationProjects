package StringPrograms;

public class SwapStringsWithout3rdVariable {
	public static void main(String[] args) {
		String str1 = "Sankar";
		String str2 = "Viswanathan";

		// Step 1: Concatenate both strings
		str1 = str1 + str2; // str1 now contains "SankarViswanathan"

		// Step 2: Extract the original str2 (which starts at the length of str1 - length of str2)
		str2 = str1.substring(0, str1.length() - str2.length()); // str2 now contains "Sankar"

		// Step 3: Extract the original str1 (which starts at the length of str2)
		str1 = str1.substring(str2.length()); // str1 now contains "Viswanathan"

		// Output the swapped strings
		System.out.println("str1: " + str1); // Should print "Viswanathan"
		System.out.println("str2: " + str2); // Should print "Sankar"
	}
}
