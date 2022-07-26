package accessmodifier;

public class Abstract_Child extends Abstract_Class{
	public void pratice01()
	{
		System.out.println("Hello new branchjava01");
	}
	
	public void editInfo()
	{
		System.out.println("edit info from child class");
	}
	public   void uploadImage()
	{
		System.out.println("uploadImage from child class");
	}
	public static void main(String[] args) {
		
		Abstract_Child ab = new Abstract_Child();
		
		ab.loginpage();
		ab.homePage();
		ab.editInfo();
		ab.uploadImage();
		
		
	}
	
}
