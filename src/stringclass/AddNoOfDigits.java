package stringclass;

public class AddNoOfDigits {

	public static void main(String[] agrrgs)
	{
		String s = "vnr97594irfw9r4ut9oigjt84657iurhg";
		boolean t ;
		
		int num = 0;
		for(int i = 0; i<s.length();i++)
		{
			char c = s.charAt(i);
			String s1 = Character.toString(c);
			t =Character.isDigit(c);
			if(t==true)
			{
		int	a = Integer.parseInt(s1);
			num = num + a;
			}
		}
		
		System.out.println(num);
		
		
		//////////alternate method//////////////
		
		String s1 = "gngre934ti90fvkmj9r30irf";
		boolean t1;
		String num1 = "";
		int flag1 = 0;
		int number1 = 0;
		int value = 0;
		for(int i =  0; i<s1.length(); i++)
		{
			
			char c1 = s1.charAt(i);
			t1= Character.isDigit(c1);
			if(t1==true)
			{
				num1 = num1 + c1;
				flag1 = 1;
				if(i!= (s.length()-1))
					continue;
				
			}
			
			if(flag1 ==1)
			{
			number1	= Integer.parseInt(num1);
			num1="";
			value = number1+ value;
			flag1 = 0;
			}
			
			
		}
		System.out.println("number is "+value);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
 
	}	

