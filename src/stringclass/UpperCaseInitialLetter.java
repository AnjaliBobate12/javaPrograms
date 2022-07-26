package stringclass;

public class UpperCaseInitialLetter {

	public static void main(String[] args) {
		
	
	String s = "this is string";
	String[] s1 = s.split(" ");
	String s4=""; 
	for(String s2:s1)
	{
		 String frstL = s2.substring(0,1);
		 String s3 = frstL.toUpperCase();
		 String rmngL = s2.substring(1);
		 s4 = s4 + s3 + rmngL + " ";
	}
	
	System.out.println(s4);
}
}
