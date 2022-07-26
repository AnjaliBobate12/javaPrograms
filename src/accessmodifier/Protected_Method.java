package accessmodifier;

public class Protected_Method {
	
	private int n=30;
	private static char m='d';
	
	private void m11()
	{
		System.out.println(n);
		System.out.println(m);
		System.out.println("nonstatic method m11 from private method");
	}
	private static void m12()
	{
		Protected_Method g=new Protected_Method();
		System.out.println(g.n);
		System.out.println(m);
		System.out.println("static methd m12 from private method");
	}
	public static void main(String[] args) {
		Protected_Method f2= new Protected_Method();
		f2.m11();
		m12();
	}

}
