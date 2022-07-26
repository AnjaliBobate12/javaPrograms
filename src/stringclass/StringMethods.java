package stringclass;

public class StringMethods {

	public static void main(String[] agrs)
	{
	///////1. equals(String s)///////////
	String s1= "velocity";
	String s2 = "Velocity";
	boolean s3 = s1.equals(s2);
	System.out.println(s3); /// false
	
	////////2. equalsIgnoreCase(String s)/////////////////////
	String s4 = "Velocity";
	String s5 = "velocity";
	boolean s6 = s4.equalsIgnoreCase(s5);
	System.out.println(s6);///true
	
	///////////3. length///////////////////////////////////////
	String s7 = "abcdeghijk";
	int s8 = s7.length();
	System.out.println(s8);///10
	
	///////////4. charAt(int index)////////////////////////////
	String s9 = "abcdefghi";
	char s10 = s9.charAt(5);
	System.out.println(s10);///f
	
	///////////5. replace(char old, char new)///////////////
	String s13 = "abcdegdfjhk";
	String s14 = s13.replace('g', 'z');
	System.out.println(s14);
	
	//////////6. replace(String old, String new)/////////////
	String s15 = "construction";
	String s16= s15.replace("truc","tor");
	System.out.println(s16);///constortion
	
	//////////7. subString(int index)////////////////////////
	String s17= "velocity";
	String s18 = s17.substring(4);
	System.out.println(s18);///city
	
	//////////8. subString(int biginingindex, int endindex)///////////
	String s19= "corporate";
	String s20 = s19.substring(1, 5);
	System.out.println(s20);///orpo
	
	//////////9. contains(String value)/////////////////////
	String s21 = "abcdefjgehrnklsjheirfnv";
	boolean s22= s21.contains("jge");
	System.out.println(s22);///true
	
	////////////10. toLowerCase()/////////////////////
	String s23= "VELOciTy";
	String s24= s23.toLowerCase();
	System.out.println(s24);///velocity
	
	/////////////11. toUpperCase//////////////////////////////////
	String s25= s23.toUpperCase();
	System.out.println(s25);///VELOCITY
	
	////////////12. indexOf(char ch)////////////////////
	String s26 = "abcdefghijklmnp";
	int s27 = s26.indexOf('e');
	System.out.println(s27);///4
	
	////////////13. trim()//////////////////////////////
	String s29= "  			happy	new 	year			";
	String s30 = s29.trim();
	System.out.println(s30);///happy	new 	year
	
	////////////14. split(string s)/////////////////////
	String s32 = "this is string";
	String[] s33 = s32.split("i");
	for(String ss:s33)
	{
		System.out.println(ss); ///th
	}							///s
								///s str
								///ng
	
	System.out.println("*********************************");	
	
	//////////////15. toCharArray()////////////////////////
	String s34 = "String value #123";
	char[] chararray = s34.toCharArray();
	int sizee = chararray.length;
	for(int ii = 0; ii<sizee; ii++)
	{
		System.out.println(chararray[ii]);
	}
	
	//////////////16. ValueOf(primitive datatype)/////////////
	int val = 100; 
	String strval = String.valueOf(val);
	System.out.println(strval+55);///10055
	
	boolean bol = false;
	String strval2 = String.valueOf(bol);
	System.out.println(strval2+"   sefrsdh");///false	sefrsdh
	
	/////////////17. parseXxx(datatype var)///////////////////
	String s36= "10";
	int s37 = Integer.parseInt(s36);
	s37=s37+3;
	System.out.println(s37);////13
	
	//////////////18. isDigit(char c)/////////////////////////
	char s43 = '0';
	boolean s44 = Character.isDigit(s43);
	System.out.println(s44);///0
	
	/////////////19. isAlphabetic(char c)/////////////////////
	char s45 = 'g';
	boolean s46 = Character.isAlphabetic(s45);
	System.out.println(s46);///true
	
	/////////////20. replaceAll(String str)////////////////
	String s48 = "vnc@#%$&oodo678%SG$*^&*gDSGHRFTvy4365nlse859ytgvf";
	String s49 = s48.replaceAll("[a-z]", ".");
	System.out.println(s49);
	
	String s50 = s48.replaceAll("[A-Za=z]", "o");
	System.out.println(s50);
	
	String s51 = s48.replaceAll("[^a-z]", "/");
	System.out.println(s51);
	
	String s52 =  s48.replaceAll("[^a-zA-Z]", " ");
	System.out.println(s52);
	
	String s53 = s48.replaceAll("[0-9]", "#");
	System.out.println(s53);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
