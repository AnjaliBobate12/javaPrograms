package stringclass;

public class If_vowels_PresentOrNot {

	
	public static void main(String[] args)
	{
	String s = "welcome";
	int length =s.length();
	int lastindex = length-1;
	int count = 0;
	boolean b = false;
	for(int i = 0; i<=lastindex;i++)
	{
	char z = s.charAt(i);
	if((z=='a')||(z=='e')||(z=='i')||(z=='o')||(z=='u'))
	{
	 b = true;
	 System.out.println(z);
	}
	
	}
	
	}
	
	
}
