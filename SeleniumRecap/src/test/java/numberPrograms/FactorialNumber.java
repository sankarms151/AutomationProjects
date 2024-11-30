package numberPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 5;
		
		int fact = 1;
		
		while (number>0) {
			
			fact=fact*number;
			
			number -=1;
			
		}
		
		System.out.println(fact);

	}

}
