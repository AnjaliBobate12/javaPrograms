package exception_handling;

public class TypesOfCatech {

	int k;
	public static void main(String[] args)
	{
	try
	{
		int i= 10;
		int j=0;
		int k=i/j;
	}
	catch(NullPointerException e)
	{
		System.out.println("NullPointer exception is executing");
	}
	catch(ClassCastException b)
	{
		System.out.println("ClassCatch exception is executing");
	}
	catch(Exception a)
	{
		System.out.println("exeception is executing");
	}
	
	System.out.println("after executing exception");
}
}