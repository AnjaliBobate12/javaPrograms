package inheritance;

public class Variables {

	static int i= 10;
	String b="bokya";
	static String t="taxi";
	
	public static void m1()
	{
		int j=9;
		 String m ="maggie";
		 System.out.println(j+1);
		 System.out.println(m+" is pagal");
		Variables a2 = new Variables();
		System.out.println(a2.b);
	}
	public void m2()
	{
		String g="gauri fair";
		System.out.println(g+" is very fair ");
		System.out.println(this.b +" bhayad ahe asa garuya mhnt ahe mazhya kde proof ahe ");
	}
	public static void main(String[] args) 
	{
		System.out.println(t);
		m1();
		Variables v = new Variables();
		v.m2();
	}
}
