package inheritance;

public class ChildVariables extends Variables {
	
	public void m3()
	{
		System.out.println(i);
		System.out.println(b);
		System.out.println(t);
		System.out.println(super.i);
		
	}

	public static void main(String[] args)
	{
		ChildVariables a4= new ChildVariables();
		a4.m3();
		System.out.println();
	}
}
