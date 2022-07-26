package javamethods;

public class Static_NonstaticInSameClass {
	
	public static void m1()
	{
		System.out.println("m1 static method ");
		
	}
	
	public static void m3()
	{
		System.out.println("m3 static method");
		m1();
		Static_NonstaticInSameClass a2= new Static_NonstaticInSameClass();
		a2.m4();
	}

	public void m2()
	{
		System.out.println("m2 nonstatic method");
		m1();
	}
	
	public void m4()
	{
		System.out.println("m4 nonstatic method");
		m2();
	}
	
	public static void main(String[] args) {
		m1();
		Static_NonstaticInSameClass.m1();
		Static_NonstaticInSameClass a1 = new Static_NonstaticInSameClass();
		a1.m2();
		a1.m1();
		a1.m3();
		m3();
		a1.m4();
		
		
	}
}
