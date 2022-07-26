package inheritance;

public class Parent extends Grandparent{

	public static void house()
	{
		System.out.println("house from parent class");
		
	}
	public void property()
	{
		System.out.println("property from parent class");
	}
	public Parent()
	{
		System.out.println("contructor from prent class");
	}
	 public static void main(String[] args)
	 {
		 house();
		 Parent a2 = new Parent();
		 a2.property(); 
		 System.out.println("**********************");
		 fd();
		 a2.gold();
		 
		 
	 }
}
