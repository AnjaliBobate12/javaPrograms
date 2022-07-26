package casting_Discussion;

public class ImpliciteandExpliciteCastng {

	
	public static void main(String[] agrs)
	{
		/////////////implicite casting////////////////////
		byte a = 30;
		int a1=(int)a;
		System.out.println(a1);
		short a2=(short)a;
		System.out.println(a2);
		float a3 = (float)a;
		System.out.println(a3);
		long a4 = (long)a;
		System.out.println(a4);
		double a5= (double)a;
		System.out.println(a5);
		
		///////////////////explicite casting/////////////////
		System.out.println("**************************************");
		int b = 5;
		byte b1 =(byte)b;
		System.out.println(b1);
		short b2 =(short)b;
		System.out.println(b2);
		
		long c = 10000;
		int c1 = (int)c;
		System.out.println(c1);//10000
		short c2 = (short)c;
		System.out.println(c2);//10000
		byte c3 = (byte)c;
		System.out.println(c3);//16  >>>>>>>>>>>data loss
	}
}
