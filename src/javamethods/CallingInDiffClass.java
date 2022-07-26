package javamethods;

public class CallingInDiffClass {

	public static void m5()
	{
		System.out.println("m5 static fromCallingInDiffClass");
		Static_NonstaticInSameClass.m1();
		Static_NonstaticInSameClass a5 = new Static_NonstaticInSameClass();
		a5.m2();
	}
	
	public void m6()
	{
		System.out.println("******************************");
		System.out.println(" m6 nonstatic from CallingInDiffClass");
		Static_NonstaticInSameClass.m1();
		Static_NonstaticInSameClass a6 = new Static_NonstaticInSameClass();
		a6.m2();
	}
	public static void main(String[] args) {
		
		m5();
		CallingInDiffClass a3 = new CallingInDiffClass();
		a3.m6();
	}
	
}
