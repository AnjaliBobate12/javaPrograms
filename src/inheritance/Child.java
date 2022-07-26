package inheritance;

public class Child extends Parent {
	
	
	public static void bike()
	{
		System.out.println("bike form child class");
		
	}
	public void games()
	{
		System.out.println("games from child class");
	}
	
	public static void main(String[] args)
	{
		bike();
		Child a1=new Child();
		a1.games();
		System.out.println("***********from parent class*****************");
		house();
		a1.property();
		System.out.println("************from grandparent class******************");
		fd();
		a1.gold();
		Parent a2 = new Child();
		a2.property();
	}
}
