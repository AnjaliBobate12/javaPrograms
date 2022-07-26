package casting_Discussion;

public class UpDownCastingChild extends UpDowncastingParent{
	
	public void m1()
	{
		System.out.println("non static method from child class");
	}
	
	public static void main(String[] agrs)
	{
		
		//////////////////Up Casting///////////////////////
		
		UpDownCastingChild c = new UpDownCastingChild();
		UpDowncastingParent p = (UpDowncastingParent)c;
				c.m1();///m1 from child class
				c.m2();///m2 method from parent class
				p.m1();/// m1 metod from child class
				p.m2();///m2 from parent class
	///////////////////Down Casting////////////////////////
				
		//	System.out.println("********************************");
		//	UpDowncastingParent y = new UpDowncastingParent();
		//	UpDownCastingChild z = (UpDownCastingChild)y;
		//	z.m1();/// classcastexception
		//	z.m2();/// classcastException
		
		UpDownCastingChild s = new UpDownCastingChild();
		UpDowncastingParent t = (UpDowncastingParent)s;
		UpDownCastingChild r = (UpDownCastingChild)t;
		r.m1();//child class
		r.m2();//parent class
		t.m1();//child class
		s.m1();//child class
		
	}

}
