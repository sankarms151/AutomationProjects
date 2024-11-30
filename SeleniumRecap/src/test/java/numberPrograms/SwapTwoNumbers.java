package numberPrograms;

public class SwapTwoNumbers {
	
	
	public void withThirdVariable() {
		
		int firstNumber=1000;
		int secondNumber=2000;
		
		System.out.println("Before swaping"+ " first number:"+firstNumber +" Second Number:"+secondNumber);
		
		int temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temp;
		
		System.out.println("After swaping"+ " first number:"+firstNumber +" Second Number:"+secondNumber);
		
		}
	
	public void withoutThirdVariable() {
		
		int first=1000; int second=2000;
		
		System.out.println("Before swaping"+ " first number:"+first +" Second Number:"+second);
		
		first=first-second; //-1000
		second=first+second;//1000
		first=second-first;//1000-(-1000) = 2000
		
		System.out.println("After swaping"+ " first number:"+first +" Second Number:"+second);
		
	}
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapTwoNumbers swap=new SwapTwoNumbers();
		//swap.withThirdVariable();
		swap.withoutThirdVariable();
		
		
	}

}
