package arraysPrograms;

import java.util.Set;
import java.util.TreeSet;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] inputArray = {1, 2, 3, -6, -5, -4, 5, 8};
		
		
		Set<Integer> set = new TreeSet<Integer>();
		
		for (int num : inputArray) {
			
			set.add(num);
			
		}
		
		System.out.println(set);
 
	}

}
