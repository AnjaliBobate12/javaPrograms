package accessmodifier;

public class Private_Method { 
	private char c= 'a';
	private static int d =50;
	private void m9(){
		System.out.println("private non static method m9");
		 System.out.println(c);
		 System.out.println(d);
	}
	
	private static void m10()
	{
		System.out.println("private static method m10");
		Private_Method f1 =new Private_Method();
		System.out.println(f1.c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Private_Method a4=new Private_Method();
		a4.m9();
		m10();
	}

}
