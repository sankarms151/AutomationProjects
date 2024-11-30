package StringPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given ="Sankar";

		//StringBuffer buffer=new StringBuffer();
		//buffer.append(given);
		//System.out.println(buffer.reverse());
		
		char[] characterArray=given.toCharArray();
		String reversed="";
		
		for (int i=characterArray.length-1;i>=0;i--) {
		reversed=reversed+characterArray[i];
			
		}

		System.out.println(reversed);
	}

}
