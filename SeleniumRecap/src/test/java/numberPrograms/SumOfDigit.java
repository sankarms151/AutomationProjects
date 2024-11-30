package numberPrograms;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12321;
		
		int sum =0;
		
		while (num>0) {
			
			int n =num%10;
			
			sum=sum+n;
			
			num /=10;
			
		}
		
		System.out.println("Sum of the digit => " + sum);

	}

}
