package exception_handling;


//////intentionally  we throw exception///////////////////////
public class Throw__Keyword {

	static int i=10;
	static int j=20;
	
	public static void m1()
	{
		if(i>j)
		{
			System.out.println("nullpointer exception");
			throw new NullPointerException();//////////////////////////////////////////
		}
		else
		{
			System.out.println("Arithmatic exception");
			throw  new ArithmeticException("throwing arthmetic exception");
		}
		}
	public static void main(String[] args) {
		m1();
		
	}
}
 