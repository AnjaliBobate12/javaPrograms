package accessmodifier;

public class Public_Class {
	
	public int b1= 100;
	public static int b2 =2000;
	
	public static void m1()
	{
		System.out.println("static method m1 from public_class");
		Public_Class b=new Public_Class();
		System.out.println(b.b1);
	}
	
	public void m8()
	{
		System.out.println("nonstatic method m8 from public_class");
		System.out.println(b1);
		System.out.println(b2);
	}
	public static void main(String[] args) {
		m1();
		Public_Class b3= new Public_Class();
		b3.m8();
		
	}

}
