public class KidsAccount extends SavingsAccount {

	private String guardian;

	public KidsAccount(String accountID, String accountHolder, double amount, double withdrawLimit,String guardian) {
		super(accountID, accountHolder, amount, withdrawLimit);
		this.guardian = guardian;
	}

	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	
	public String getGuardian() {
		return this.guardian;
	}
	
	public boolean withdraw(double withdrawAmount, String guardian) {
		if(withdrawAmount<amount && getGuardian() == guardian) {
			amount -= withdrawAmount;
			return true;
		}else{
			System.out.println("You can only withdraw with the authorization of the guardian");
			return false;
		}	
	}
}
