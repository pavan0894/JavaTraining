package bank.MybankDemo;

public class Deposit 
{
	int AccountNumber ;
	public Deposit(int AccountNumber)
	{
		this.AccountNumber = AccountNumber;
	}
	
	public double depositAmount(int AccountNumber,double Amount)
	{
		//bussiness logic
		//Go to Db ==> get current balance where accountNumber = accNumber;
		double currentBalance = 1000.00;
		
		double newBalance = currentBalance + Amount;
		
		return newBalance;
	}
}
