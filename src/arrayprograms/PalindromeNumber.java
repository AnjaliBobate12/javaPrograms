package arrayprograms;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		int num = 12321;
		String num1 = String.valueOf(num);
		String reverse = "";
		int length = num1.length()-1;
		for(int i= length;i>=0; i--)
		{
			reverse = reverse + num1.charAt(i);
		}
			
			int num3 = Integer.parseInt(reverse);
			
			if(num==num3)
			{
				
				System.out.println("Number is palindrome");
				
			}
			
			else
			{
				System.out.println("number is not a palindrom");
			}
	
	
	}
	
}
