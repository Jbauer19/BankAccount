/**
 * 
 * @author Josh Bauer
 * BankAccount
 * Period 7
 *
 */
public class BankAccount 
{
	
	private String name;
	
	private int accNum;
	
	private double balance;
	
	
	public BankAccount(String accName, int accNumber)
	{
		name = accName;
		
		balance = 0;
		
		accNum = accNumber;
	}
	
	public BankAccount(double accBalance)
	{
		balance = accBalance;
	}
	
	public void setDeposit(double depositAmount)
	{
		balance += depositAmount;
		
	}
	
	public void setWithdraw(double withdrawAmount)
	{
		balance -= withdrawAmount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "name: " + name;
	}
	
	
	

}
