package exception_handling;

public class Thread_Sleep {

	public static void main(String[] args) {
		System.out.println("First line");
		
		try
		{
			Thread.sleep(4000);
			
		}
		
		catch(InterruptedException e)
		{
			System.out.println("catch block");
		}
		
		System.out.println("last line");
	}
}
