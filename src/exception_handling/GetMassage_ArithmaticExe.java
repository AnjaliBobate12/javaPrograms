package exception_handling;

public class GetMassage_ArithmaticExe {

	public static void main(String[] args) {
		 
	try
	{
		int i =10;
		 int j=0;
		 int k=i/j;
	}
	
	catch(ArithmeticException s)
	{
		String Message= s.getMessage();
		System.out.println("Arthmetic Exception block");
		System.out.println("Message");
	}
	}
}
