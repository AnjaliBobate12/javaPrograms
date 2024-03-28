package stringclass;

public class CountSentence {

	public static void main(String[] args) {

	String s ="Hii , i am Anjali.How are you? i am doing well";
	String [] s1 =s.split("?");
	int size = s1.length;
	int count = 0;
	
	
	for(int i =0 ; i< size ; i++)
	{	
	
	count++;
	
	}
	System.out.println(count);
	System.out.println("hiii");
	}
	
}
