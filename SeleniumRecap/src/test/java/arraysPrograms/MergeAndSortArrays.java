package arraysPrograms;

import java.util.*;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 9,11};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10};
        
        // Create two TreeSet instances to handle each array separately
        Set<Integer> set1 = new TreeSet<Integer>();
        Set<Integer> set2 = new TreeSet<Integer>();
        
        // Add elements from arr to set1
        for (int num : arr) {
            set1.add(num);
        }
        
        // Add elements from arr1 to set2
        for (int num : arr1) {
            set2.add(num);
        }
        
        // Combine set1 and set2 to remove duplicates and maintain sorting
        set1.addAll(set2);
        
        // Convert set1 to Integer[] array
        Integer[] sortedArray = set1.toArray(new Integer[0]);
        
        // Print the sorted unique elements
        System.out.println(Arrays.toString(sortedArray));
    }
}
