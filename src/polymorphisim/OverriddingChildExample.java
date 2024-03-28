package polymorphisim;

public class OverriddingChildExample extends overriddingprentexample 
{

	public static void m1()
	{
		System.out.println("method m1 from child class");
	}
	
	public static void main(String[] args) {
		m1();
		overriddingprentexample p1 = new overriddingprentexample();
		p1.m1();
		p1.m2();
		overriddingprentexample p2 = new OverriddingChildExample();
		p2.m1();
		p2.m2();
		
		
	}
}
