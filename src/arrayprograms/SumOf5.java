package arrayprograms;

public class SumOf5 {

	public static void main(String[] args)
	{
		int [] a = {0,1,2,3,4,5};
		for(int i =0 ; i< a.length; i++)
		{
			int x = a[i];
			
			for(int j = 0 ; j<a.length; j++)
			{
				int y = a[j];
				
				if(x+y==5)
				{
					System.out.println("["+x +"   "+y +"]");
				}
			}
		}
	}
}
