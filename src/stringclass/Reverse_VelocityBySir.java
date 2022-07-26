package stringclass;

public class Reverse_VelocityBySir {
 public static void main(String[] args) {
	

	String s1= "velocity is job";
	String rev ="";
	int size = s1.length();
	int indexval = size-1 ;
	
	for(int i=indexval; i>=0; i--)
	{
		rev = rev + s1.charAt(i); 
	}
	
	System.out.println(rev);
 }


 }
