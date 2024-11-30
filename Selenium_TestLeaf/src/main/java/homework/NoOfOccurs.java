package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NoOfOccurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="Cognizant";
		char[]a=text.toCharArray();
		int len=0;
		
		Map<Character,Integer>charMap=new HashMap<Character,Integer>();
		
		for(char c:a)
			if(charMap.containsKey(a))
		{
			
			{
				//system.out.print(c);
				if(charMap.containsKey(c))
				{
					len=charMap.get(c);
					charMap.put(c,len+1);
				}
				else
				{
					charMap.put(c, 1);
				}
				
			}
			System.out.println(charMap);
		}

		
	}

}
