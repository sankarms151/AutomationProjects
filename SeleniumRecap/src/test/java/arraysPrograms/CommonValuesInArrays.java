package arraysPrograms;

import java.util.*;

public class CommonValuesInArrays {
	
    public static void main(String[] args) {
    	
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8};
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();
        
        // Add elements from arr1 to set1
        for (int num : arr1) {
            set1.add(num);
        }
        
        // Check elements in arr2 if they exist in set1
        for (int num : arr2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }
        
        // Print common elements
        System.out.println("Common elements in the arrays:");
        for (int num : commonElements) {
            System.out.print(num + " ");
        }
    }
}
