package StringPrograms;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="Sankar Viswanathan";
		int vowelsCount=0;
		
		input=input.toLowerCase();
		
		int length=input.length();
		
		for (int i = 0; i <length; i++) {
			
			if (input.charAt(i)=='a' ||input.charAt(i)=='e' ||input.charAt(i)=='i' ||input.charAt(i)=='o' ||input.charAt(i)=='u') {
			
				vowelsCount++;
				
			}
			
			
		}
		
		System.out.println("The given string has " +vowelsCount  +" Vowels ");
		
		
	}

}
