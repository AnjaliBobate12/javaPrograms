package stringclass;

import java.util.HashMap;

public class OccuranceOfCharactorsInString {
	public static void main(String[] args) {
		
	String s ="rnrfnkkksdnnisnvrfvnsfjkb";
	HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
	
	for(int i=0; i<s.length(); i++)
	{
	char c = s.charAt(i);
	if(hm.containsKey(c))
	{
		hm.put(c, hm.get(c)+1);
	}
	else
	{
		hm.put(c, 1);
	}
	}
	System.out.println(hm);
}
}