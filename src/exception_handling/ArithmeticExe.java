package exception_handling;

public class ArithmeticExe {
	int k ;
	
	public static void main(String[] args) {
		
	try 
	{
	int i=10;
	int j=0;
	int k=i/j;
	System.out.println(k);
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Arithmatic exception is executing");
	}
	
	System.out.println("after exception handling");
}
	
}
