package StringPrograms;

public class RemovingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "Irdia"; // O/p - 
	        
	        //String result = str.replaceAll("[aeiouAEIOU]", "");
	        
	        String result = str.replace("r", "n");
	        
	        System.out.println("Original string: " + str);
	        System.out.println("String without vowels: " + result);

	}

}
