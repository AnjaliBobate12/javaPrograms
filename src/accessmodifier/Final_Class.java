package accessmodifier;

 public final class Final_Class {
	static String  s="abc";
	//public_final/////////////////////////////
	public final void m4()
	{
		System.out.println("nonstatic method from pubic_final class ");
		System.out.println(s);
	}
	
	public final static void m5()
	{
		System.out.println("static method m5 from public_final class");
	}
	
	//default_final/////////////////////////////
	
	final void m6()
	{
		System.out.println("nonstatic method m6 from default_final class");
	}
	
	final static int m7()
	{
		System.out.println("static method m7 from default_final class");
		return 100;
	}
	
	public static void main(String[] args) {
		Final_Class a2=new Final_Class();	
		a2.m4();
		m5();
		a2.m6();
		m7();
	}

}
