package arrayprograms;

public class FactorialOfNumber {
	int num;
	int count = 0;
	public  void number(int num)
	{	
		
		System.out.println("Factorials of number are as follows:");
		for(int i = 1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.print(i+"   ");
				count++;
			}
		}	
		System.out.println();	
		System.out.println("There are total "+count+" factorial");	
		
	}

	public static void main(String[] args)
	{
		FactorialOfNumber fN = new FactorialOfNumber();
		fN.number(81);
		
		
	}
}
