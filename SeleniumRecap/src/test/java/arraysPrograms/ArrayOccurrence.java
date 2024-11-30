package arraysPrograms;

import java.util.HashMap;
import java.util.Map;

public class ArrayOccurrence {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,2,4,2};

		Map<Integer, Integer> countMap = new HashMap<>();

		for(int num : arr){

		countMap.put(num, countMap.getOrDefault(num,0) + 1);

		}


		for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){

		System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		
		/*
		 * String[] a = {"Apple", "Apple", "Orange", "Muskmelon", "Pomegrante"};
		 * 
		 * Map<String, Integer> countMap = new HashMap<>();
		 * 
		 * // Count occurrences of each element for (String num : a) { num=
		 * num.toLowerCase(); if(countMap.containsKey(num)) { countMap.put(num,
		 * countMap.get(num) + 1); } else { countMap.put(num, 1); } }
		 * 
		 * // Iterate to print the counts for (Map.Entry<String, Integer> entry :
		 * countMap.entrySet()) { System.out.println(entry.getKey() + "=" +
		 * entry.getValue()); }
		 */
		    }
				
	}


