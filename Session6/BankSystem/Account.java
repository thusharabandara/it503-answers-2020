public class Account {
	public String accountID;
	protected String accountHolder;
	protected double amount;
	
	public void setAccHolder(String accHolder) {
		this.accountHolder = accHolder;
	}
	
	//Default Constructor
	Account(){
		
	}
	
	Account(String accountID, String accountHolder, double amount){
		this.accountHolder = accountHolder;
		this.accountID = accountID;
		this.amount = amount;
	}

	//method to deposit amount 
	public void deposit(String depositAmount) {
		this.amount += Integer.parseInt(depositAmount);
	}
	
	//method to check if withdrawal valid or not
	public boolean withdraw(double w) {
		if(w < this.amount) {
			amount -= w;
			return true;
		}
		return false;		
	}
	
	public void details() {
		System.out.println("*****Account Details******\n\n");
		System.out.println("Account ID: " + this.accountID + "\n");
		System.out.println("Account Holder Name: " + this.accountHolder + "\n");
		System.out.println("Amount: " + this.amount);
	}
}
