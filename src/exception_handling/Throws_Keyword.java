package exception_handling;

import java.io.FileNotFoundException;

public class Throws_Keyword {

	public static void main(String [] args) throws InterruptedException, FileNotFoundException,Throwable
	{
		System.out.println(" first line");
		int i= 10;
		int j=0;
		int k=i/j;
		System.out.println("last line");
	}
}
