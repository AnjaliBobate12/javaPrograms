package encapsulation;

public class BankServer {

	private int cust1_balance = 50000;
	
	public void getbalance(int pin)
	{
		if(pin == 2345)
		{
			System.out.println("your account balance is  "+cust1_balance);
		}
		else
		{
			System.out.println("invalid pin");
		}	
		
	}
	
	public void setBalance(int amount)
	{
		if(amount<=cust1_balance)
		{
			cust1_balance = cust1_balance-amount;
			System.out.println("Amount: " + amount + " has been withdrawled from your account");
			System.out.println("remaining amount: "+ cust1_balance);
			
		
		}
		
	
	}
}
