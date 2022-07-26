package exception_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Try_Catch_Finally {
	
	public static void main(String[] args)
	{
		try
		{
			System.out.println("before exception");
			FileInputStream f = new FileInputStream("C:\\Users\\laptop\\Desktop\\testing\\automation teating\\gaurav sir notes");
		}
		catch(NullPointerException a)
		{
			System.out.println("***************");
		}
		
		catch(FileNotFoundException s)
		{
			System.out.println("file not fount exception is runing");
		}
		catch(Exception c)
		{
			System.out.println("exception class is excuting");
		}
		finally
		{
			System.out.println("finally method is executing");
		}
		System.out.println("after exception handling");
	}
}
