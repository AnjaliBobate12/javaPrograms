package accessmodifier;

 class Default_Class {
	 
	static int i=100000;
	void m2()
	{
		System.out.println("non static method m2 from default class ");
		System.out.println(i);
	}
	
	static void m3()
	{
		System.out.println("static method m3 from default class");
		System.out.println(i);
	}

	public static void main(String[] args) {
		Default_Class a1=new Default_Class();	
		a1.m2();
		m3();
		}
}
