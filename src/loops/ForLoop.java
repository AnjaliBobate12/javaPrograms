package loops;

public class ForLoop {    //star pattern
	
	//for(intialization_statment   1  ; boolean_condition   2,5; increment/decrement_operator   4,7 
	//{
	// action    3,6;
	//}
	
	public static void main(String[] args) {
		for(int j=1;j<=5;j++)
		{
		for(int i=1;i<=j;i++)
		{
			System.out.print("*");
			
		}
		System.out.println();
		}
		
		}

}
