package StringPrograms;

public class PalindromeChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "lool";
		
		char[] charArray = str.toCharArray();
		
		String reversed = "";
		
		for(int i=charArray.length-1;i>=0;i--) {
			
			reversed = reversed + charArray[i];
			
		}
		
		System.out.println(reversed);
		
		if(reversed.equals(str)) {
			
			System.out.println("Given string is palindrome");
		}
		
		else {
			System.out.println("Given string is not palindrome");
		}

	}

}
