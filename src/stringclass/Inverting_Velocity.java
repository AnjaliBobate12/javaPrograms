package stringclass;

public class Inverting_Velocity {
	
	public static void main(String[] args) {
		 
		 String v1 = "velocity" ;
		String v2 = "";
	
	for(int i=v1.length()-1 ;i>=0;i--)
	{
		
		v2 = v2 + v1.charAt(i);
	}
	System.out.print(v2);
}
}
