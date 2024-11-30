package numberPrograms;

public class CheckingPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;

		int count = 0;

		for (int i = 2; i <= a/2; i++) {

			if(a%i ==0) {

				count++;
			}

		}
		if(count == 0) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a Prime number");
		}
	}

}
