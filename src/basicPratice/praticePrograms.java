package basicPratice;

public class praticePrograms {

	static String b="";
	static String c="" ;
	static int flag;
	static int z;
	public static void m1(String a)
	{
		for(int i=a.length()-1 ;i>=0 ; i--)
		{
			b= b+a.charAt(i);
		}
		
		System.out.println(b);
	}
	
	public static String m2(String b)
	{
	
		String [] word = b.split(" ");
		
		for(int j = word.length-1; j>=0; j--)
		{
			c= c + word[j]+ " ";
		}
		
		System.out.println(c);
		
		return c;
	}
	
	public static void m3(int[] d)
	{
		for(int i =0 ; i< d.length; i++)
		{
		 z	= d[i];
		for (int j = 0; j< d.length; j++)
		{
			if(z<d[j]);
			flag=1;
			if(z==d[j]);
			continue;
		}
		}
		if(flag==1)
		{
			System.out.println("minimum no from the arrray is "+z);
			flag=0;
		}
				
				
	}
	public static void main(String[] args)
	{
		m1("this is string");
		m2 ("My name is Anjali");
		int[] d = {1,2,3,4,5,6,7};
		m3(d);
	}
}
