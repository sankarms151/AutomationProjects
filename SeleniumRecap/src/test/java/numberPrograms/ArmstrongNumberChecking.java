package numberPrograms;

public class ArmstrongNumberChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 153;

		int temp = num;

		int arm = 0;

		while (num>0) {

			int n=num%10;

			arm = arm + (n*n*n);

			num /= 10;

		}
		
		if (arm == temp) {
			System.out.println("It's Armstrong Number");
			
		} else {
			
			System.out.println("It's not an Armstrong Number");
			
		}
			

	}

}
