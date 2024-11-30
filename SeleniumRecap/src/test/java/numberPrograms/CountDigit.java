package numberPrograms;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12321;
		
		int count = 0;
		
		while (num>0) {
			
			count++;
			
			num /=10;
			
		}

		System.out.println("Number of digit => " + count);
	}

}
