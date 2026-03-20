public class BankAccount
{
	double accountNumber;
	double balance;
	String accountHolder;
	
}

	protected void deposite(double amount)
	{
		if(amount>0)
		{
			this.balance+=amount;
			System.out.print("deposited:"+amount);
		}
	
	}
	
	protected double getBalance()
	{
	 return this.balance();	
	}
	protected void  withdraw(double amount){
		
		if(amount<=balance){
		balance=balance-amount;
		}
		else
		{
			System.out.println("low balance:"+getBalance());
		}
	}
public class Bank{
	public static void main(String args[]){
		BankAccount ba = new BankAccount();
		ba.deposite(10000);
		ba.withdraw(15000);
		ba.withdraw(5000);
     System.out.println("Final Check: " + ba.getBalance());	
	}
}