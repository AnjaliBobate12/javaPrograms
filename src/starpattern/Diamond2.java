package starpattern;

public class Diamond2 {
	
	public static void main(String[] args) {
		for(int i=1;i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				if(j>=4-i || j<=i+2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}
		
	

	
	for(int i=4;i<=5; i++)
	{
		for(int j=5; j<=4; j--)
		{
			if(j>=i-2 || j<=8-i)
			{
			System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println(); 
	}
}
}