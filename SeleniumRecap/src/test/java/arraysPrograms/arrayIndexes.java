package arraysPrograms;

import java.util.ArrayList;
import java.util.List;

public class arrayIndexes {

    public static void main(String[] args) {
        
        int[] arr = {1, 5, 2, 8, 9};
        
        // Lists to store values at odd and even indices
        List<Integer> evenIndexValues = new ArrayList<>();
        List<Integer> oddIndexValues = new ArrayList<>();
        
        // Iterate through the array and separate values based on index
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenIndexValues.add(arr[i]);
            } else {
                oddIndexValues.add(arr[i]);
            }
        }
        
        // Print the results
        System.out.println(evenIndexValues);  // Values at even indices
        System.out.println(oddIndexValues);   // Values at odd indices
    }
}
