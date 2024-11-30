package numberPrograms;

import java.util.Iterator;

public class FindEvenNumber {

	public static void main(String[] args) {
		
		for (int i = 1; i <=100; i++) {
			if(i%2 ==0) {
				//i +=2; To print alternate even number
				System.out.println(i);
			}
		}
	}

}
