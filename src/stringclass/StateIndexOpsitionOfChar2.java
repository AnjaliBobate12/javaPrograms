package stringclass;

public class StateIndexOpsitionOfChar2 {

	
		public static void main(String[] args)
			{	
				String s = "This is String";
				int	lastindex = s.length();
			//	int count = 0;
				
				for(int i = 0; i<lastindex; i++)
				{
					char c =s.charAt(i);
					
					
					if(c=='i')
					{
						
						System.out.println(s.indexOf('i')	);
						
					}
					
				}
			}
		
}
