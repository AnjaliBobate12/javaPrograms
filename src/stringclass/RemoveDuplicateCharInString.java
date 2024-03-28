package stringclass;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		String s = "aaa bbb c d";
		String a = "";
		int flag = 0;
		char c = 0;
		int i;
		int j;
		for(i = 0 ; i < s.length()-1; i++)
		{
			c = s.charAt(i);
			
			for(j = 0; j< s.length()-1; j++)
			{
				char d = s.charAt(j);
				
				if(!(c==d))
					flag= 1;
				
					
			}
	}
		if(flag==1)
		{
			
			System.out.println(s.charAt(i));
			flag=0;
		}
	}
}
