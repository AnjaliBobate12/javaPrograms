package stringclass;

public class String_Examples {

	public static void main(String[] agrs)
	{
		String s = new String("abc");
		String ss = "jkl";
		String s1 = new String("def");
		String ss1 = "jkl";
		String s2 = new String("jkl");
		String s3 = new String("abc");
		
		boolean ispointsame=ss==ss1;
		System.out.println(ispointsame);/////true
		
		boolean ispointsameobj=ss==s2;
		System.out.println(ispointsameobj);//////false
		
		boolean is_equal=s3.equals(s);
		System.out.println(is_equal);///////////true
		
		boolean is_equal2 = ss.equals(s2);
		System.out.println(is_equal2);/////////true
		
		String var1 = "velocity";
		var1.concat("corporate");
		System.out.println(var1);////////////velocity
		
		var1= var1.concat(" corporate");
		System.out.println(var1);//////////velocity corporate
		
		StringBuffer sb = new StringBuffer("velocity");
		sb.append(" corporate");
		System.out.println(sb);/////////////velocity corporate
		
		
		
		
		
}
}
