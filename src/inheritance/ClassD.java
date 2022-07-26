package inheritance;

public class ClassD  extends ClassE{

	public void m10()
	{
		System.out.println("method m10");
		m1();
		m5();
		m9();
	}

	public void m11()
	{
		System.out.println("method m11");
		m1();
		m6();
		
	}

	public void m12()
	{
		System.out.println("method m12");
		m1();
		m9();
	}

	public static void main(String[] args) {
		
		
		object();
		
	}
	
}

