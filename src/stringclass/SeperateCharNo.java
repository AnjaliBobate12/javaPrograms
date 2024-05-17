package stringclass;

public class SeperateCharNo {
public static void main(String[] args)
{
	String s1= "abcd1234ghjkli8376";
	String s3="";
	String s4="";
//	boolean s2 = true;
	for(int i=0; i<s1.length();i++)
	{
		char c = s1.charAt(i);
		
	//	if( s2 == Character.isAlphabetic(c))
		if( true == Character.isAlphabetic(c))
		{
			 s3 = s3 +  s1.charAt(i);
				
			
		}
		else
		{
			s4 = s4 + s1.charAt(i);
			
		}
		
}
	System.out.println(s3);
	System.out.println(s4);
}
}
