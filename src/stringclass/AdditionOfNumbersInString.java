package stringclass;

public class AdditionOfNumbersInString {

	public static void main(String[] args) {
		int sum = 0;
		int flag= 0;
		String num= "";
		String s = "vr75";
		int l = s.length();
		for(int i = 0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num = num + s.charAt(i);
				flag = 1;
//				if(i!= (s.length()-1))
//				{
//					continue;
//				}
			}
		
		if(flag==1)
		{
			int value = Integer.parseInt(num);
			sum = sum + value;
			num="";
			flag =0;
			
			}
		
	}
		System.out.println("sum is : "+sum);
		System.out.println(l);
}
}
