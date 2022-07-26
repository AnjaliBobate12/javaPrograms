package variablesinjava;

public class LocalVariables1 {

	public static void main(String[] args) 
	{
		
		int i=50;
		System.out.println(i);
	

	if(i<20)
	{
		
		int k=50;
		System.out.println(k);
	}
	else
	{
	System.out.println("i is not greater than 20");
	System.out.println(i);
	LocalVariables1 add=new LocalVariables1();
	add.addition();
	
	}
	}
	
	public void addition()
	{
		int i=20;
		int j=30;
		int k=i+j;
		System.out.println("the output of addition is "+k);
		
	}
}
