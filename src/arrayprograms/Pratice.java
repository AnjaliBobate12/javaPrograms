package arrayprograms;

public class Pratice {
public static void main(String[] args)
{
	int [] a = new int[6];
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
	a[3] =  4;
	a[5] = 5;
	int size = a.length;
	for(int i=0; i<= size ;i++)
	{
		if(i%2==0)
		{
		System.out.println(a[i]);
		}
	}
}
}
