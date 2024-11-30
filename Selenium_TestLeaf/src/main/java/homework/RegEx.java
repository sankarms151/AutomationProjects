package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegEx {

	public static void main(String[] args) {
		
		String input ="sankarms151@gmail.com";
		String pattern ="[a-zA-Z]+[0-9]+@[a-z]{5}+.[a-z]{3}";		
		
		Pattern p=Pattern.compile(pattern);
		Matcher match=p.matcher(input);
		System.out.println(match.matches());
		

	}

}	
