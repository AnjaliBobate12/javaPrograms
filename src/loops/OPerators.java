package loops;

public class OPerators {
	
	public static void main(String[] args) {
		int x=10;
		int y=x++;
		System.out.println(y);//10
		System.out.println(x);//11
		
		int a=10;
		int b=++a;
		System.out.println(b);//11
		System.out.println(a);//11
		
		int c=10;
		int d=c--;
		System.out.println(c);//9
		System.out.println(d);//10
		
		int e=10;
		int f=--e;
			System.out.println(e);//9
		System.out.println(f);//9
	}

}
