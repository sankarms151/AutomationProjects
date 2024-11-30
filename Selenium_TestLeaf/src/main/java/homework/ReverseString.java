package homework;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "HexaWare";

		// convert String to character array
		// by using toCharArray
		char[] text = input.toCharArray();
		
		for (int i = text.length-1; i>=0; i--)
			System.out.print(text[i]);
	}

	}


