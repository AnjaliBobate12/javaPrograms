package stringclass;

public class StateIndexPositionOfChar {

	public static void main(String[] args)
		{	
			String s = "This is String";
			int	lastindex = s.length();
			int index = 0;
			char z = 'i';
			for(int i = 0; i<lastindex; i++)
			{
				char c =s.charAt(i);
				
				Integer []	a1 = new Integer[s.length()];
				if(z==c)
				{
				
			//	for(int  j= 0 ; j<lastindex ; j++ )
			//	{
				 index =s.indexOf(c);
			//	}
				}	
			}
			System.out.println("Index positions are "+ index);
		}
	
}