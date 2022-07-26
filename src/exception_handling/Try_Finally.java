package exception_handling;

public class Try_Finally {

	public static void main (String[] args)
	{
		try
		{
		int i=10;
		int j= 0;
		int k= i/j;
		System.out.println(k);
		}
		finally
		{
			System.out.println("finally method is executing");
		}
	}
}
