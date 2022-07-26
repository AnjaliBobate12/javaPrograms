package accessmodifier;

public abstract class Abstract_Class {
	
	public Abstract_Class()
	{
		System.out.println("contructor from abstract class");
	}
	
	public void loginpage()
	{
		System.out.println("loginpage from Abstract class");
	}
	public static void homePage()
	{
		System.out.println("homepage from Abstract class");
	}
	public abstract void editInfo();
	public abstract  void uploadImage();
	
	
	
}
