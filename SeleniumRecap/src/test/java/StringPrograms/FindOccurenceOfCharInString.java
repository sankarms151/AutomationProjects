package StringPrograms;

public class FindOccurenceOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="SAnkar Viswanathan";
		char toFind='a';
		int Occur=0;
		
		input=input.toLowerCase();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)==toFind) {
			Occur++;	
			}
			
			System.out.println(toFind +" is present " +Occur + " Number of times");
			
		}
		//System.out.println(toFind +" is present " +Occur + " Number of times");
	}

}
