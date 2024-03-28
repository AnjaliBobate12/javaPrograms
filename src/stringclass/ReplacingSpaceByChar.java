package stringclass;

public class ReplacingSpaceByChar {

	public static void main(String[] args)
	{
		String s ="We will rock you";
		String n ="";
		char b;
		int length = s.length();
		
		for(int i = 0; i < length; i++)
		{
			char a = s.charAt(i);
			if (a==' ')
			{
				char c = '_';
				//b=c;
				//a=b;
				//n=n+a;
				n=n+c;
			}
			else
			{
			n=n+s.charAt(i);
			}
		}
		System.out.println(n);
	
	}
}
