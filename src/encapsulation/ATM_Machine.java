package encapsulation;

public class ATM_Machine {
	
	public void balEnq(int pin)
	{
		BankServer bs = new BankServer();
		bs.getbalance(pin);
	}
	
	public void withdrawl(int amount)
	{
		BankServer bs = new BankServer();
		bs.setBalance(amount);
	}
	
	public static void main(String[] args) {
		ATM_Machine bal = new ATM_Machine();
		bal.balEnq(2345);
		bal.withdrawl(1000);
		bal.withdrawl(1000);
		bal.balEnq(2345);
	}
	
}
