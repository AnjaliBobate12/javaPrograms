package collectiondiscusion;

import java.util.HashMap;

public class CountNoOfDuplicateChar {

	public static void main(String [] args)
	{
		String s = "aabbccdddhbuhbjkknkjjn";
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i =0; i< s.length();i++  )
		{
			char charvalue = s.charAt(i);
			
			if(hm.containsKey(charvalue))
			{
				hm.put(charvalue,hm.get(charvalue)+1);
			}
			else
			{
				hm.put(charvalue,1);
			}
		}
		System.out.println(hm);
	}	
}
		
