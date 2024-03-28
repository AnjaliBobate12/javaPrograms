package stringclass;

public class Count_Repeatation {
public static void m1(char a1)
{
	 
	String s28 = "aabbaaccd";
	int count =0;
	
	for(int i=0; i<s28.length(); i++)
	{
		char c = s28.charAt(i);
		
		if(c==a1)
		{
			count++;
		}
		
	}
	
System.out.println("Character "+a1+"  is present for "+count+" times");


}

public static void main(String[] agrs)
{
	m1('c');
	}
		
}
