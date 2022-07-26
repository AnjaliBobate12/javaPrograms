package variablesinjava;

public class ThisKeyword {

	static int i = 50;
	int k =60;
	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		ThisKeyword tk=new ThisKeyword();
		System.out.println(ThisKeyword.i);
		System.out.println(tk.k);		
		
	}
	
	public void m1()
	{
		int k= 80;
		System.out.println(k);
		System.out.println(this.k);
	}	
}
