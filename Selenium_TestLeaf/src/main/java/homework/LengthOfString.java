package homework;

public class LengthOfString {
		 public static void main(String args[]){
		  
		  String company="Amazon development centre";
		  System.out.println("length of company string :"+getLengthOfString(company));
		  
		  }
		  
		  public static int getLengthOfString(String str)
		  {
		    int i=0;
		  try{
		   for(i=0;;i++)
		   {
		    str.charAt(i);
		   }
		   
		  }
		  catch(Exception e)
		  {
		   
		  }
		  return i;
		 }
		 
}
