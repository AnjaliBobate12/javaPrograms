package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FileNotFondExe {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("before tracking the file");
			FileInputStream s = new FileInputStream("C:\\Users\\laptop\\Desktop\\testing\\SQL\\DAY01.docx");
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println("file not found exception arrived and catch block is executing");
		}
		catch(FileNotFoundException s)
		{
			System.out.println(" file not found exception");
		}
		
		
		System.out.println("after exception ");
	}
}
