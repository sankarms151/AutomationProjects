package StringPrograms;

public class JoiningStrings {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";

		// String result = str1 + " " +str2;

		// String result = str1.concat(" ").concat(str2);

		//System.out.println(result);

		
		  // Using StringBuilder 
		  StringBuilder sb = new StringBuilder();
		  sb.append(str1); 
		  sb.append(" ");
		  sb.append(str2);
		  
		  String result = sb.toString(); 
		  System.out.println(result); // Output: Hello World
		  }
}
