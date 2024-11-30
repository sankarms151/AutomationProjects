package arraysPrograms;

public class ArraySortAlternatelyUsingPointers {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		int[] output = new int[arr1.length];
		int left = 0;                // Pointer for the start of arr1
		int right = arr1.length - 1; // Pointer for the end of arr1

		// Iterate through the output array and fill it in interleaved pattern
		for (int i = 0; i < arr1.length; i++) {
			if (i % 2 == 0) {
				output[i] = arr1[left++];  // Fill with left pointer and increment
			} else {
				output[i] = arr1[right--]; // Fill with right pointer and decrement
			}
		}

		// Print the output array
		for (int num : output) {
			System.out.print(num + " ");
		}

	}

}


