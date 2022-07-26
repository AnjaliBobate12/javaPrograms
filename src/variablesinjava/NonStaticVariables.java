package variablesinjava;

public class NonStaticVariables {
	
	int i=50;
	String s="abc";

	
	public static void main(String[] args) {
		NonStaticVariables a= new NonStaticVariables();
		a.i=10;
		System.out.println(a.i);
		a.i=20;
		System.out.println(a.i);
		a.s="bcd";
		System.out.println(a.s);
		a.s="abc";
		a.s=a.s+"bcd";
		System.out.println(a.s);
	}
	

}
