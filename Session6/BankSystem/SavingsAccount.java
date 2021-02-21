public class SavingsAccount extends Account {
	
	 
	protected double withdrawLimit;
	private SpecialInterest interest;
	
	public SavingsAccount(String accountID, String accountHolder, double amount,double withdraw) {
		  super(accountID, accountHolder, amount); 
		  this.withdrawLimit = withdraw;
		  this.interest = new SpecialInterest(0.05, 1000000.00); // interest rate: 5%, value Limit: 1000000/=
	}
	 
	
	public void setWithdrawLimit(double amount) {
		this.withdrawLimit = amount;
	}
	
	public double getWithdrawalLimit() {
		return withdrawLimit;
	}
	
	@Override
	public boolean withdraw(double withdrawalamount) {
		this.amount += this.interest.calInterest(this.amount); // passed the value as a string
		if(withdrawalamount <= getWithdrawalLimit() && withdrawalamount <= this.amount) { 
			 amount -=withdrawalamount; 
			 return true;
		} 
		return false; 
		 
	}
		
	@Override
	public void details() {
		super.details();
		System.out.println("Withdrawal Limit: " + this.getWithdrawalLimit());
	}
}
