package StringPrograms;

public class LengthOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String givenString="Sachin Tendulkar";
		
		System.out.println(givenString.length());
		
	char[] charArray=givenString.toCharArray();
	
	int length=0;
	for (char c : charArray) {
		
		length++;
		
	}
		
		System.out.println(length);
	}

}
