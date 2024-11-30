package arraysPrograms;

public class SmallestArrayAndLargest {
    public static void main(String[] args) {
        // Sample array
        int[] array = {10, 5, 20, 15, 25};

        // Find the smallest element
        int smallest = array[0]; // Assume the first element is the smallest
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the result
        System.out.println("The smallest element in the array is: " + smallest);
    }
}

/*
 * int largest = array[0]; // Assume the first element is the smallest 
 * for (int i = 0; i < array.length; i++) { 
 * if (array[i] > largest) { 
 * largest = array[i];
 * } 
 * }
 * 
 * // Print the result
 * System.out.println("The smallest element in the array is: " + largest);
 */