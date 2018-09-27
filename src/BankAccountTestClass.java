
public class BankAccountTestClass 
{

	public static void main(String[] args) 
	{
		BankAccount account1 = new BankAccount("Josh's Acount", 1234);
		BankAccount account2 = new BankAccount(100.0);
		
		account2.setDeposit(100.0);
		System.out.println(account2.getBalance());
		
		account2.setWithdraw(100.0);
		System.out.println(account2.getBalance());
		
		System.out.println(account1.toString());
		
		
		
		

	}

}
