package inheritance;

public class Overriding_Child extends Overriding_Parent {

	public void marry()
	{
		System.out.println("nonstatic method from child class");
	}
	
	public void cycle()
	{
		System.out.println("cycle from child class");
	}
	
	public static void house()
	{
		System.out.println("static methd house from child class  ");
	}
	
	public static void main(String[] args) {
		Overriding_Child a1 = new Overriding_Child();
		a1.cycle();
		Overriding_Parent a2 = new Overriding_Parent ();
		a2.cycle();
		System.out.println("*************");
		Overriding_Parent a3 = new Overriding_Child();//child class
		System.out.println("***************");
		a3.cycle();
		house();
		a1.house();
		a2.house();
		System.out.println("****************");
		a3.house();//parent class
		System.out.println("****************");
	}
	
}
