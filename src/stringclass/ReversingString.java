package stringclass;

public class ReversingString {
	
	public static void main(String[] args) {
		
	String s = "This is String";
	
	String [] s1= s.split(" ");
	
	int l =s1.length;
	for(int i=l-1; i>=0; i--)
	{
		
		System.out.print(s1[i]+ " ");
	}

}
}
