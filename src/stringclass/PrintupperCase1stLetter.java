package stringclass;

public class PrintupperCase1stLetter {

	public static void main(String[] args)
	{
		String s = "hii i am anjali bobate ";
		String s3 = "";
		
		String [] s1 = s.split(s);
		for(int i = 0 ; i< s1.length; i++)
		{
		for(String s2 : s1)
		{
			
			String firstLetter= s2.substring(0, 1);
			String fuc = firstLetter.toUpperCase();
			String later= s2.substring(1);
			s3=s3+fuc+ later;
			
		}
		}
		System.out.println(s3);
		
		
	}
}


