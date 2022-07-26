package stringclass;

public class VowelsPresentInString {

	public static void main(String[] args)
	{
	String s = "welcome";
	int length =s.length();
	int lastindex = length-1;
	int count = 0;
	for(int i = 0; i<=lastindex;i++)
	{
	char z = s.charAt(i);
	if((z=='a')||(z=='e')||(z=='i')||(z=='o')||(z=='u'))
	{
	count++;
	}
		}
	System.out.println(count);

	}

	
}
