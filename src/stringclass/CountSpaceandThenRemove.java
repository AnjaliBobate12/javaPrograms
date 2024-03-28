package stringclass;

public class CountSpaceandThenRemove {

	public static void main(String[] args)
	{
		String s = " India P S A ";
		int count = 0;
		char c;
		int length = s.length();
		for(int i=0; i<length;i++)
		{
			c= s.charAt(i);
		if(c == ' ')
		{
			count++;
		}
		}
		System.out.println("totel spacing is "+count);
		
		String s1 = s.replaceAll(" ", "");
		System.out.println(s1);
	}
}
