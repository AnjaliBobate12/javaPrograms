package variablesinjava;

public class LocalVariables {

	public static void m1()
	{
		int a = 1555555;
		boolean b = true;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void m2()
	{
		int a = 888888;
		String s = "fbuerfb";
		System.out.println(a);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
//		m1();
//		LocalVariables b1 = new LocalVariables();
//		b1.m2();
//		
		
		int a = 10;
		int z = a++;
		System.out.println(z);
		System.out.println(a);
	}
}
