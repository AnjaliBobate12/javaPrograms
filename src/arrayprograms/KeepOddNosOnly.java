package arrayprograms;

public class KeepOddNosOnly {

	public static void main(String[] args)
	{
		Integer [] i = {1,2,3,4,5,6,7,8,9};
		for(int j=0; j < i.length ;j++)
		{
			if(!(j%2!=0))
			{
				System.out.println(i[j]);
			}
		}
		
	}
}
