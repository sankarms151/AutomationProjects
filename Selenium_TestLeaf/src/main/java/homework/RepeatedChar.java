package homework;

public class RepeatedChar {

	public static void main(String[] args) {
		String input = "Wipro india pvt ltd";

		// convert String to character array
		// by using toCharArray
		int count=0;
		
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='i'){
				count++;
			}
		}		
		
		System.out.println(count);
		}

	}

