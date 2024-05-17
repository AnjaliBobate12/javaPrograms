package stringclass;

public class ReplacingSpaceByChar {

	public static void main(String[] args)
	{
		String s ="We will rock you";
		String n ="";
		char b;
	//	int length = s.length();
		
		for(int i = 0; i < s.length(); i++)
		{
			char a = s.charAt(i);
			if (a==' ')
			{
				
			
				n=n+'_';
			}
			else
			{
			n=n+s.charAt(i);
			}
		}
		System.out.print(n);
	
	}
}
