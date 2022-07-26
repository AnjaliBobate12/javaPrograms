package stringclass;

public class RemoveAlphabetsFromString {

	public static void main(String[] args) {
		String s = "rltu4875904jknfvf784ifn";
		String val = "";
		for(int i= 0;i<s.length();i++)
		{
		if(!(Character.isAlphabetic(s.charAt(i))))
		{
			val = val + s.charAt(i);
		}
	}
		System.out.println(val);
}
	
}
