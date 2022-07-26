package variablesinjava;

public class GlobalVariables {

	static int a = 1;
	String a2 = "ab";
	
	public static void m1()
	{	int a = 1234455;
		System.out.println(a);
		System.out.println(a);
		GlobalVariables b = new GlobalVariables();
		System.out.println(b.a2);
		
		
	}
	public void m2()
	{	String a2 = "anjali";
		System.out.println(a);
		System.out.println(a2);
		System.out.println(this.a2);
		
	}
	public static void main(String[] args) {
		m1();
		GlobalVariables b2 = new GlobalVariables();
		b2.m2();
	}
}
