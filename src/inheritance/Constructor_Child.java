package inheritance;

public class Constructor_Child extends Constructor_Parent {

	public Constructor_Child()
	{
		System.out.println("constructor from child class");
		
	}
	
	public Constructor_Child(int i)
	{
		System.out.println("contrstuctor from child class with int i");
	}
	
	public static void main(String[] args) {
		Constructor_Child a = new Constructor_Child();
		Constructor_Child b = new Constructor_Child(200);
	}
}
