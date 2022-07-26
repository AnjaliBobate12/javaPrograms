package exception_handling;

public class NulPointrExe {
 
	static NulPointrExe npc;
	
	public void m1()
	{
		System.out.println("nonstatic m1 is executing");
	}
	public static void main(String[] args)
	{
		 try 
		 {
			npc.m1();
		 }
		 catch(NullPointerException d)
		 {
			 System.out.println(" exception arrived");
		 }
		 
		 System.out.println("after exception");
	}
	
}
