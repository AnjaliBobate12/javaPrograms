package stringclass;

public class Count_Repeatation {
public static void main(String[] args)
{
	 
	String s28 = "aabbaaccd";
	int count =0;
	
	for(int i=0; i<s28.length(); i++)
	{
		char c = s28.charAt(i);
		
		if(c=='a')
		{
			count++;
		}
		
	}
	
	System.out.println("Character a is present for "+count+" times");
		
}
}