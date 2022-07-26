package javamethods;

public class CategoriesOfMethods {

	//1.methods with no return type and no arguments
	
	public static void m1()
	{
		System.out.println("static m1 methods with no return type and no arguments");
	}
	 public void m2()
	 {
		 System.out.println(" nonstatic m2 methods with no return type and no arguments");
		 
	 }
	
	 //2. methods with no return type and  arguments
	 
	 public static void m3(int a, char c)
	 {
		 System.out.println(" no return type and taking arguments int a nd char c");
	 }
	 
	 public void m4(int a, int b)
	 {
		 System.out.println("no return type and taking arguments int a and int b");
	 }
	 
	 //3. methods with return type and no arguments
	 
	 public static int m5()
	 {
		 System.out.println(" static method m5 with int return type and no arguments");
		 return 100;
	 }
	 
	 public char m6()
	 {
		 System.out.println("nonstatic method m6 with int returmn type and no arguments");
		 return 'g';
	 }
	 
	 //4. methods with return type and arguments
	 
	 public static String m7(char x, int h)
	 {
		System.out.println(" static method m7 with string return type and with argument");
		return "sdgkekrgf";
	 }
	 public boolean m8(String f, boolean j)
	 {
		 System.out.println("nonstatic methoed with boolean return type and with arguments");
		 return true;
	 }
	 
	 public static void main(String[] args) {
		m1();
		CategoriesOfMethods a7 = new CategoriesOfMethods();
		a7.m2();
		a7.m3(10, 'g');
		a7.m4(50, 0);
		a7.m5();
		a7.m6();
		a7.m7('h', 0);
		a7.m8("", false);
		
		
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
