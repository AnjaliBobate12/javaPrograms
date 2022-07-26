package conditionalstatement;

public class ContinueStatement {
	
	public static void main(String[] agrs)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=10;j++)
			{
				
				if(i==j)
				{
					System.out.print(" ");
					continue;
				}
				else
				{
				System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
	}

}
