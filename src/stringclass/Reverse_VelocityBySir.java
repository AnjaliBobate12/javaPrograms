package stringclass;

public class Reverse_VelocityBySir {
 public static void main(String[] args) {
	

	String s1= "velocity is job";
	String rev ="";
	
	
	
	for(int i=s1.length()-1; i>=0; i--)
	{
		rev = rev + s1.charAt(i); 
	}
	
	System.out.println(rev);
 }


 }
